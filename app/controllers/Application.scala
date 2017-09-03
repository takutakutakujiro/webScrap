package controllers

import java.net.SocketTimeoutException

import model.SessionBean
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import utils.Utils._


object Application extends Controller {

	val cashSessionBean = new SessionBean()
	val SEARCHED = "searched"

	def index = Action {

		Ok(views.html.index(createParSessionBean))
	}

	def scrapBtn = {
		cashSessionBean.checkedSiteModel.sumo match {
			case false =>
				cashSessionBean.houseAllListMap = scrap_sumo.scrapStart
				cashSessionBean.checkedSiteModel.sumo = true
			case _ =>
		}

		cashSessionBean.viewListMap = createViewListMap(cashSessionBean.houseAllListMap, 0, 30)
		cashSessionBean.status = SEARCHED
	}

	def fetchListSelectedPageNumber(selectedPageNo: Int) = Action {

		val sliceFromNo = selectedPageNo match {
			case 1 => 0
			case _ => (selectedPageNo - 1) * 30
		}

		cashSessionBean.viewListMap = createViewListMap(cashSessionBean.houseAllListMap, sliceFromNo, sliceFromNo + 30)
		cashSessionBean.currentPageNumber = selectedPageNo

	 	Ok(views.html.index(cashSessionBean))
	}

	case class SiteData(sumo: String)

	val siteForm = Form(
	    mapping(
	    	"sumo" -> text
	    )(SiteData.apply)(SiteData.unapply)
	)

	def post = Action { implicit request =>
    	try {

				//formのエラーチェック
				val selectSite = siteForm.bindFromRequest.hasErrors match {
					case true => null
					case _ =>  siteForm.bindFromRequest.get
				}

				selectSite match {
					case null =>
					case x if x.sumo == "1" => scrapBtn
				}


    		Ok(views.html.index(createParSessionBean))
		 } catch {

	 		case ex: SocketTimeoutException =>
	 			println("SocketTimeoutExceptionエラーです。")

				cashSessionBean.viewListMap = List[Map[String, String]]()
				cashSessionBean.status = "SocketTimeoutException"

	 			Ok(views.html.index(cashSessionBean))

	 		case e: Exception =>
				println("予期せぬエラーです。")
				println(e)

				cashSessionBean.viewListMap = List[Map[String, String]]()
				cashSessionBean.status = e.toString

	 			Ok(views.html.index(cashSessionBean))
		}
	}

	def createParSessionBean: SessionBean = {

		val sessionBean = new SessionBean()

		cashSessionBean.checkedSiteModel.sumo match {

			case true =>
				sessionBean.checkedSiteModel.sumo = true
				sessionBean.status = SEARCHED
				sessionBean.viewListMap = cashSessionBean.viewListMap
				sessionBean

			case _ => sessionBean
		}
	}
}	 
