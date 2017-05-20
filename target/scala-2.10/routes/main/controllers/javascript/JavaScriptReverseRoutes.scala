
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nishida-takuro/heroku/webScrap/conf/routes
// @DATE:Sun May 21 01:52:40 JST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:4
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asset/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:3
    def nextContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.nextContent",
      """
        function(no) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "page/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("no", no)})
        }
      """
    )
  
  }


}