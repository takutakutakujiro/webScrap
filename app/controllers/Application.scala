package controllers

import java.net.SocketTimeoutException

import model.SessionBean
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


object Application extends Controller {

	val sessionBean = new SessionBean()

	def index = Action {

		sessionBean.status = "first"

		Ok(views.html.index(sessionBean))
	}

	def scrapBtn = {
 		sessionBean.houseAllListMap match {
			case map if map.isEmpty => sessionBean.houseAllListMap = scrap_sumo.scrapStart
			case _ =>
		}

		sessionBean.viewListMap = sessionBean.houseAllListMap.slice(0,30)
		sessionBean.status = "searched"
	}

	def fetchListSelectedPageNumber(selectedPageNo: Int) = Action {
	 var sliceFromNo = 0

		if(selectedPageNo == 1) sliceFromNo = 0
		else sliceFromNo = (selectedPageNo - 1) * 30

		sessionBean.viewListMap = sessionBean.houseAllListMap.slice(sliceFromNo, sliceFromNo + 30)
		sessionBean.currentPageNumber = selectedPageNo

	 	Ok(views.html.index(sessionBean))
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

				selectSite.sumo match {
					case "1" =>
						scrapBtn
						sessionBean.checkedSiteModel.sumo = true
					case _ =>
				}

    		Ok(views.html.index(sessionBean))
		 } catch {

	 		case ex: SocketTimeoutException =>
	 			println("SocketTimeoutExceptionエラーです。")

				sessionBean.viewListMap = List[Map[String, String]]()
				sessionBean.status = "SocketTimeoutException"

	 			Ok(views.html.index(sessionBean))

	 		case e: Exception =>
		 		println("予期せぬエラーです。")

				sessionBean.viewListMap = List[Map[String, String]]()
				sessionBean.status = e.toString

	 			Ok(views.html.index(sessionBean))
		}
	}
}	 
