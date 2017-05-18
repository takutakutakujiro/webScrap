
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nishida-takuro/git/webScrap/conf/routes
// @DATE:Fri May 19 01:50:29 JST 2017


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
