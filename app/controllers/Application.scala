package controllers

import play.api.mvc._
import java.net.InetAddress
import collection.mutable.ListBuffer
import collection.immutable.ListMap
import utils.Utils._


object Application extends Controller {

	var allList = List[Map[String, String]]()
	var viewList = List[Map[String, String]]()

	 def index = Action {
	 	
	 	if (allList.isEmpty) 
	 		allList = scrap.scrapStart

	    viewList = allList.slice(0,30)
	 	
	 	Ok(views.html.index.render(allList, viewList, 1))

	}

	def nextContent(pageNo: Int) = Action {
		var sliceNo = 0
		if(pageNo == 1) sliceNo = 0
		else sliceNo = (pageNo - 1) * 30
		viewList = allList.slice(sliceNo, sliceNo + 30)
	 	Ok(views.html.index.render(allList, viewList, pageNo))
	}
}	 
