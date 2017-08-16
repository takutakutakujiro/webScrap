
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- BootstrapのCSS読み込み -->
	<link href=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*9.63*/("""" rel="stylesheet">
	<!-- jQuery読み込み -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- BootstrapのJS読み込み -->
	<script src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*13.62*/(""""></script>
	<!-- CSS読み込み -->
	<link href=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("css/style.css")),format.raw/*15.55*/("""" rel="stylesheet">

	<title>"""),_display_(/*17.10*/title),format.raw/*17.15*/("""</title>
 </head>
 	<body>
 		"""),_display_(/*20.5*/content),format.raw/*20.12*/("""
 	"""),format.raw/*21.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Aug 16 23:23:14 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/main.scala.html
                  HASH: b57a14498dc3af7648db08d2eee3fb577d7cc5f3
                  MATRIX: 530->1|655->31|682->32|933->257|947->263|1009->305|1210->479|1225->485|1286->525|1357->569|1372->575|1427->609|1484->639|1510->644|1567->675|1595->682|1625->685
                  LINES: 20->1|25->1|26->2|33->9|33->9|33->9|37->13|37->13|37->13|39->15|39->15|39->15|41->17|41->17|44->20|44->20|45->21
                  -- GENERATED --
              */
          