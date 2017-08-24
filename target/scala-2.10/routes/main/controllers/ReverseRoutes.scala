
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nishida-takuro/heroku/webScrap/conf/routes
// @DATE:Tue Aug 22 03:34:51 JST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:4
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "asset/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:1
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def post(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix)
    }
  
    // @LINE:3
    def fetchListSelectedPageNumber(no:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "page/" + implicitly[PathBindable[Int]].unbind("no", no))
    }
  
    // @LINE:1
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}