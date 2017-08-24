
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nishida-takuro/heroku/webScrap/conf/routes
// @DATE:Tue Aug 22 03:34:51 JST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index"""),
    ("""POST""", prefix, """controllers.Application.post"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """page/$no<[^/]+>""", """controllers.Application.fetchListSelectedPageNumber(no:Int)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """asset/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_Application_post1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_post1_invoker = createInvoker(
    controllers.Application.post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "post",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_Application_fetchListSelectedPageNumber2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("page/"), DynamicPart("no", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_fetchListSelectedPageNumber2_invoker = createInvoker(
    controllers.Application.fetchListSelectedPageNumber(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchListSelectedPageNumber",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """page/$no<[^/]+>"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_Assets_versioned3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("asset/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """asset/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
      }
  
    // @LINE:2
    case controllers_Application_post1_route(params) =>
      call { 
        controllers_Application_post1_invoker.call(controllers.Application.post)
      }
  
    // @LINE:3
    case controllers_Application_fetchListSelectedPageNumber2_route(params) =>
      call(params.fromPath[Int]("no", None)) { (no) =>
        controllers_Application_fetchListSelectedPageNumber2_invoker.call(controllers.Application.fetchListSelectedPageNumber(no))
      }
  
    // @LINE:4
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}