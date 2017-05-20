
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nishida-takuro/heroku/webScrap/conf/routes
// @DATE:Sun May 21 01:52:40 JST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
