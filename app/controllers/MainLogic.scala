package controllers

import org.jsoup._
import org.jsoup.nodes.Element
import collection.JavaConverters._
import utils.Utils._
import utils.scrapUtil._


object scrap_sumo {

	val NONE = "None"
	val urlstr = "http://suumo.jp/ikkodate/tokyo/sc_setagaya/"	

	def scrapStart: List[Map[String, String]] = {
		val urlList = createUrlList(getMaxPageNo(urlstr))
		createMap(".property_unit-content", "sumo", urlList)	
	}

	val getMaxPageNo = (urlstr : String) => {
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
}