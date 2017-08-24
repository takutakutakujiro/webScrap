package model

class SessionBean {

  var houseAllListMap = List[Map[String, String]]()

  var viewListMap = List[Map[String, String]]()

  var status: String = "first"

  var currentPageNumber: Int = 1

  var maxPageNumber: Int = 1

  var checkedSiteModel = new CheckedSiteModel()

}
