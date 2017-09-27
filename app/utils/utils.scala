package utils

import org.jsoup._
import collection.JavaConverters._
import scala.util.matching.Regex.{Match, MatchIterator}
import collection.immutable.ListMap
import controllers.scrap_sumo._

object JsoupUtil {	
	def start (url: String, tag: String) = Jsoup.connect(url).get.select(tag).asScala
}

object JsonUtil {
	def getDocJson (key : String, value : String) = "\"" + key + "\":" + "\"" + value + "\""
	def getIndexJson (no : Int) = """{"index":{"_id":"""" + no + """"}}"""
	def getDefIndexJson = """{"index":{}}"""
}

object Utils {
	def isNone (str : String): Boolean = if (str == "None") true else false
    def getItem (target: String, regexStr: String): String = optCheck(regexStr.r.findFirstMatchIn(target))
    def getElaItems (target: String, regexStr: String): Map[String, String] = createElaMap(regexStr.r.findFirstMatchIn(target))
    def optCheck(o: Option[Match]) = {
		o match {
			case Some(s) => o.get.group(1)
			case None => "None"
		}
    }
	def createElaMap(o: Option[Match]): Map[String, String] = {
		Map[String, String](
			"title" 			-> o.get.group(1),
			"detail_url"	-> o.get.group(2),
			"img" 				-> o.get.group(3),
			"minPrice"  	-> o.get.group(4),
			"maxPrice"  	-> o.get.group(5),
			"address"   	-> o.get.group(6),
			"station" 		-> o.get.group(7),
			"minSpace" 		-> o.get.group(8),
			"maxSpace" 		-> o.get.group(9),
			"roomLayout"	-> o.get.group(10)
		)
	}

	val createViewListMap = (listMap: List[Map[String, String]], from: Int, to: Int) => {

		listMap.slice(from, to) map { m =>

			val fixedMap = m("minPrice") match {

				case x if x.length > 4 =>
					m + ("minPrice" -> priceUnitModification(x))

				case _ =>
					m + ("minPrice" -> yenUnitGrant(m("minPrice")))
			}

			fixedMap("maxPrice") match {

				case x if x.length > 4 =>
					fixedMap + ("maxPrice" -> priceUnitModification(x))

				case _ =>
					fixedMap + ("maxPrice" -> yenUnitGrant(m("maxPrice")))
			}
		}
	}

	def priceUnitModification (price: String): String = {

		price match {

			case "未定" => price

			case _ =>

				// 億単位の数字が何文字あるかを求める
				val firstPriceLength = price.length - 4

				// 億の位を抽出し、単位に億をつける
				val oku = price.substring(0, firstPriceLength) + "億"

				// 万の位を抽出し、単位をつける
				val man = yenUnitGrant(price.substring(firstPriceLength))

				oku + man

		}
	}

	def yenUnitGrant (price: String) = {

		price.dropWhile {

				_ == '0'

		} match {

			case "未定" 	=> price
			case "" 		=> "円"
			case str		=> str + "万円"

		}
	}
}

object scrapUtil {

	def createMap (classStr: String, siteName: String, list : List[String]): List[Map[String, String]] = {	
		import collection.mutable.ListBuffer
		val b = new ListBuffer[Map[String, String]]
		list.par.foreach { url => 
			val jsoup = JsoupUtil.start(url, classStr).toList

			jsoup.par.foreach { m => 
				//タイトル、詳細画面url、画像、販売価格、所在地、駅、土地面積、間取り
				val iMap = Map[String, String](
					"site"		 		-> siteName,
					"title"      	-> getTitle(m),
					"detail_url" 	-> getDetailUrl(m),
					"img" 		 		-> getImg(m),
					"minPrice"   	-> getMinPrice(m),
					"maxPrice"   	-> getMaxPrice(m),
					"address"    	-> getAddress(m),
					"station" 	 	-> getStation(m),
					"minSpace" 	 	-> getMinSpace(m),
					"maxSpace" 	 	-> getMaxSpace(m),
					"roomLayout" 	-> getRoomLayout(m)
				)
				printMap(iMap)
				b += iMap
			}
		}
		b.toList		
	}

  def printMap(map: Map[String,String]) = {
    	//println("\n==================")
    	//println("site：" + map("site"))
    	println("title：" + map("title"))
		// println("detail_url：" + map("detail_url"))
		// println("img：" + map("img"))
		// println("minPrice：" + map("minPrice"))
		// println("maxPrice：" + map("maxPrice"))
		// println("address：" + map("address"))
		// println("station：" + map("station"))
		// println("minSpace：" + map("minSpace"))
		// println("maxSpace：" + map("maxSpace"))
		// println("roomLayout：" + map("roomLayout"))
	}

	def trimPriceCal (oku: Int, man: Int) = oku * 10000 + man
}