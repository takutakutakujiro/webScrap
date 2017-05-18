package controllers

import org.jsoup._
import org.jsoup.nodes.Element
import collection.JavaConverters._
import java.io.{File, PrintWriter}
import scala.util.matching.Regex.Match
import scala.collection.mutable.Buffer
import collection.immutable.ListMap
import utils.Utils._
import utils.JsoupUtil._
import utils.JsonUtil._

object scrap {

	val urlstr = "http://suumo.jp/ikkodate/tokyo/sc_setagaya/"
	val NONE = "None"

	def scrapStart: List[Map[String, String]] = {
		val urlList = createUrlList(getMaxPageNo(urlstr))
		createMap(urlList)	
	}
	

	def getMaxPageNo(urlstr : String): Int = {
		val main_jsoup_con = Jsoup.connect(urlstr)
	    val element = main_jsoup_con.get.select(".pagination").asScala.head
		val dateP1 = "[0-9]* ".r		
		val pageCntStr = dateP1.findAllIn(element.text).toList.last.trim.toInt
		println(s"[SUMO][世田谷区][最大ページ数]：$pageCntStr")
		pageCntStr
	}

	def createUrlList(maxPageNo : Int): List[String] = {
		import collection.mutable.ListBuffer
		var b = new ListBuffer[String]
		maxPageNo.to(1, -1).foreach { i =>
			val createdUrl = createUrl(i.toString)
			println(s"[SUMO][世田谷区][URL][$i]：$createdUrl")
			b += createdUrl
		}
		b.toList
	}

	def createUrl (pageNo : String) = urlstr + "pnz1" + pageNo + ".html"

	def createMap (list : List[String]): List[Map[String, String]] = {	
		import collection.mutable.ListBuffer
		val b = new ListBuffer[Map[String, String]]
		list.par.map { url => 
			val jsoup = start(url, ".property_unit-content") 

			jsoup.par.map { m => 
				//タイトル、詳細画面url、画像、販売価格、所在地、駅、土地面積、間取り
				val iMap = Map[String, String](
					"title"      -> getTitle(m),
					"detail_url" -> getDetailUrl(m),
					"img" 		 -> getImg(m),
					"minPrice"   -> getMinPrice(m),
					"maxPrice"   -> getMaxPrice(m),
					"address"    -> getAddress(m),
					"station" 	 -> getStation(m),
					"minSpace" 	 -> getMinSpace(m),	
					"maxSpace" 	 -> getMaxSpace(m),	
					"roomLayout" -> getRoomLayout(m)
				)
				printMap(iMap)
				b += iMap
			}
		}
		b.toList		
	}

    def getTitle      (e : Element): String = getItem(e.toString, """<h2 class="property_unit-title">.*<a.*>(.*)</a></h2>""")
    def getDetailUrl  (e : Element): String = getItem(e.toString, """<h2 class="property_unit-title">.*<a href="(.*)" target""")
    def getImg        (e : Element): String = getItem(e.toString, """rel="(.*)" alt""").replaceAll("amp;","")
    def getAddress    (e : Element): String = getItem(e.toString, """所在地\n.*\n.*\n\s+?(\S.*)""")
    def getStation    (e : Element): String = getItem(e.toString, """沿線・駅\n.*\n.*\n\s+?(\S.*)""")	
    def getMinSpace   (e : Element): String = getItem(e.toString, """土地面積\n.*\n.*\n\s+?(\S.*)m""")
	def getRoomLayout (e : Element): String = getItem(e.toString, """間取り\n.*\n.*\n\s+?(\S.*)""")
    
    def getMaxSpace   (e : Element): String = {
    	val result = getItem(e.toString, """土地面積\n.*\n.*\n.*\n.*</sup>[～|・](.*)m""")
    	if (isNone(result)) return getMinSpace(e) else result
    }

    def getMinPrice (e : Element): String = {
    	val regex1 = """dottable-value">(.*[万|億]).*～.*</span>"""
		val result1 = getItem(e.toString, regex1)
		if (result1 != NONE) return trimPrice(result1)

    	val regex2 = """dottable-value">(.*[万|億]).*・.*</span>"""
		val result2 = getItem(e.toString, regex2)		
		if (result2 != NONE) return trimPrice(result2)

		else return getPrice(e)
    }

    def getMaxPrice (e : Element): String = {
    	val regex1 = """dottable-value">.*～(.*[万|億]).*</span>"""
		val result1 = getItem(e.toString, regex1)
		if (result1 != NONE) return trimPrice(result1)

    	val regex2 = """dottable-value">.*・(.*[万|億]).*</span>"""
		val result2 = getItem(e.toString, regex2)
		if (result2 != NONE) return trimPrice(result2)

		else return getPrice(e)
    }

    def getPrice (e: Element): String = {
    	val regex1 = """dottable-value">(.*[万|億]).*</span>"""
		val result1 = getItem(e.toString, regex1)
		if (result1 != NONE) return trimPrice(result1)

    	val regex3 = """dottable-value">(未定)</span>"""
		return getItem(e.toString, regex3)

		return NONE
    }

    def trimPrice (str: String): String = {    	
 		val res1 = getItem(str, """([0-9]*)億""")
 		val res2 = getItem(str, """([0-9]*)万""")

 		if (res1 != NONE){
 			val priceCal = trimPriceCal(res1.toInt, _:Int)
 			if (res2 != NONE) priceCal(res2.toInt).toString else priceCal(0).toString
 		}
 		else if (res2 != NONE) trimPriceCal(0, res2.toInt).toString
 		else str
    }

    def printMap(map: Map[String,String]) ={
    	println("\n==================")
    	println("title" + map("title"))
		println("detail_url" + map("detail_url"))
		println("img" + map("img"))
		println("minPrice" + map("minPrice"))
		println("maxPrice" + map("maxPrice"))
		println("address" + map("address"))
		println("station" + map("station"))
		println("minSpace" + map("minSpace"))
		println("maxSpace" + map("maxSpace"))
		println("roomLayout" + map("roomLayout"))
    }

    def trimPriceCal (oku: Int, man: Int) = oku * 10000 + man
}