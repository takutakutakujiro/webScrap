package controllers

import java.net.{InetAddress, SocketTimeoutException}
import collection.mutable.ListBuffer
import collection.immutable.ListMap
import utils.Utils._

import play.api.mvc._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


object Application extends Controller {

	var allList = List[Map[String, String]]()
	var viewList = List[Map[String, String]]()

	def index = Action {
		Ok(views.html.index(allList, viewList, 1, "first"))		
	}

	def scrapBtn = {
 		if (allList.isEmpty) 
 			allList = scrap_sumo.scrapStart

 		viewList = allList.slice(0,30)
	}

	def nextContent(pageNo: Int) = Action {
		var sliceNo = 0
		if(pageNo == 1) sliceNo = 0
		else sliceNo = (pageNo - 1) * 30
		viewList = allList.slice(sliceNo, sliceNo + 30)
	 	Ok(views.html.index.render(allList, viewList, pageNo, null))
	}

	case class SiteData(sumo: String)

	val siteForm = Form(
	    mapping(
	    	"sumo" -> text
	    )(SiteData.apply)(SiteData.unapply)
	)

	def post = Action { implicit request =>
    	try {
    		val selectSite = siteForm.bindFromRequest.get
    		if (selectSite.sumo == "1") scrapBtn
    		Ok(views.html.index.render(allList, viewList, 1, null))
		 } catch {
	 		case ex: SocketTimeoutException =>
	 			println("SocketTimeoutExceptionエラーです。")
	 			var viewList = List[Map[String, String]]()
	 			Ok(views.html.index.render(allList, viewList, 1, "SocketTimeoutException"))
	 		case e: Exception =>
		 		println("予期せぬエラーです。")
	 			var viewList = List[Map[String, String]]()
	 			Ok(views.html.index.render(allList, viewList, 1, e.toString))
		}
	}

}	 
