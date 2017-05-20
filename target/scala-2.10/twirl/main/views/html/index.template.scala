
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Map[String, String]],List[Map[String, String]],Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elaListMap: List[Map[String, String]], viewListMap: List[Map[String, String]], pageNo: Int, status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*17.2*/navi/*17.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
    	 <div class="navbar-header">
    	 
    	  	<a class="navbar-brand" href="#">LOGO</a>
    	 
    	  	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#nav-content2">
      			<span class="icon-bar"></span>
      			<span class="icon-bar"></span>
      			<span class="icon-bar"></span>
    		</button>
    	  </div>
		  <div id="nav-content" class="collapse navbar-collapse">
		    <!--リンクのリスト メニューリスト-->
		    <ul class="nav navbar-nav">
		      <li><a href="">Link1</a></li>
		      <li><a href="">Link1</a></li>
		      <li><a href="">Link1</a></li>
		      <!--ドロップダウン化するliタグ-->
		      <li class="dropdown">
		        <a href="#" class="dropdown-toggle" data-toggle="dropdown" href="">Drop  <b class="caret"></b></a>
		        <ul class="dropdown-menu">
		          <li><a href="#">Link1</a></li>
		          <li><a href="#">Link2</a></li>
		          <li><a href="#">Link3</a></li>
		          <li class="divider"></li>
		          <li><a href="#">Link A</a></li>
		          <li class="divider"></li>
		          <li><a href="#">LInk B</a></li>
		        </ul>
		      </li>
		    </ul>

		    <!--検索フォーム-->
		    <form class="navbar-form navbar-right" role="search">
		      <div class="form-group">
		        <input type="text" class="form-control" placeholder="Search">
		      </div>
		      <button type="submit" class="btn btn-default">Submit</button>
		    </form>
		  </div>
    </nav>
""")))};def /*61.2*/first/*61.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*61.11*/("""
	"""),format.raw/*62.2*/("""<form method="POST">
		<input type="checkbox" name="sumo" value=1>sumo</input>
		<button type="submit" class="btn btn-success">スクレイピングスタート！</button>
	</form>
	
""")))};def /*69.2*/list/*69.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*69.10*/("""
	"""),format.raw/*70.2*/("""<div class="property_unit-content">

	"""),_display_(/*72.3*/for( map <- viewListMap ) yield /*72.28*/{_display_(Seq[Any](format.raw/*72.29*/("""
		"""),format.raw/*73.3*/("""<div class="container">
			<a href=""""),_display_(/*74.14*/map("detail_url")),format.raw/*74.31*/("""" target="_blank">
				<div class="col-xs-12"><h4>"""),_display_(/*75.33*/map("title")),format.raw/*75.45*/("""</h4></div>
				<div class="col-xs-4"><img src=""""),_display_(/*76.38*/map("img")),format.raw/*76.48*/("""" rel="" alt="" width="192" height="144"></div>
			</a>
			<div class="col-xs-2 item">販売価格</div>
			<div class="col-xs-6 item">
				"""),_display_(/*80.6*/if(map("minPrice") == map("maxPrice"))/*80.44*/{_display_(Seq[Any](format.raw/*80.45*/("""
					"""),_display_(/*81.7*/map("minPrice")),format.raw/*81.22*/("""
				""")))}/*82.7*/else/*82.12*/{_display_(Seq[Any](format.raw/*82.13*/("""
					"""),_display_(/*83.7*/map("minPrice")),format.raw/*83.22*/(""" """),format.raw/*83.23*/("""~ """),_display_(/*83.26*/map("maxPrice")),format.raw/*83.41*/("""
				""")))}),format.raw/*84.6*/("""
			"""),format.raw/*85.4*/("""</div>
			<div class="col-xs-2 item">所在地</div>
			<div class="col-xs-6 item">"""),_display_(/*87.32*/map("address")),format.raw/*87.46*/("""</div>	
			<div class="col-xs-2 item">沿線・駅</div>
			<div class="col-xs-6 item">"""),_display_(/*89.32*/map("station")),format.raw/*89.46*/("""</div>											
			<div class="col-xs-2 item">土地面積</div>
			<div class="col-xs-6 item">
				"""),_display_(/*92.6*/if(map("minSpace") == map("maxSpace"))/*92.44*/{_display_(Seq[Any](format.raw/*92.45*/("""
					"""),_display_(/*93.7*/map("minSpace")),format.raw/*93.22*/("""
				""")))}/*94.7*/else/*94.12*/{_display_(Seq[Any](format.raw/*94.13*/("""
					"""),_display_(/*95.7*/map("minSpace")),format.raw/*95.22*/(""" """),format.raw/*95.23*/("""~ """),_display_(/*95.26*/map("maxSpace")),format.raw/*95.41*/("""
				""")))}),format.raw/*96.6*/("""
				"""),format.raw/*97.5*/("""m<sup>2</sup>
			</div>
			<div class="col-xs-2 item">間取り</div>
			<div class="col-xs-6 item">"""),_display_(/*100.32*/map("roomLayout")),format.raw/*100.49*/("""</div>
		</div>
	""")))}),format.raw/*102.3*/("""
	"""),format.raw/*103.2*/("""</div>
""")))};def /*106.2*/page/*106.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*106.10*/("""
	"""),format.raw/*107.2*/("""<nav class="pagecontent" aria-label="Page navigation example">
	  <ul class="pagination">
	    <li class="page-item">
	      """),_display_(/*110.9*/if(pageNo == 1)/*110.24*/{_display_(Seq[Any](format.raw/*110.25*/("""
            """),format.raw/*111.13*/("""<a class="page-link" href="#" aria-label="Previous">
	      """)))}/*112.10*/else/*112.15*/{_display_(Seq[Any](format.raw/*112.16*/("""
	      	"""),format.raw/*113.9*/("""<a class="page-link" href=""""),_display_(/*113.37*/{url}),_display_(/*113.43*/{pageNo-1}),format.raw/*113.53*/("""" aria-label="Previous">
	      """)))}),format.raw/*114.9*/("""
	        """),format.raw/*115.10*/("""<span aria-hidden="true">&laquo;</span>
	        <span class="sr-only">Previous</span>
	      </a>
	    </li>
	    """),_display_(/*119.7*/if(pageNo == 1 || pageNo == 2)/*119.37*/{_display_(Seq[Any](format.raw/*119.38*/("""
			"""),format.raw/*120.4*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*120.54*/{url}),format.raw/*120.59*/("""1">1</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*121.57*/{url}),format.raw/*121.62*/("""2">2</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*122.57*/{url}),format.raw/*122.62*/("""3">3</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*123.57*/{url}),format.raw/*123.62*/("""4">4</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*124.57*/{url}),format.raw/*124.62*/("""5">5</a></li>
	    """)))}/*125.8*/else/*125.13*/{_display_(Seq[Any](format.raw/*125.14*/("""
	    	"""),format.raw/*126.7*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*126.57*/{url}),_display_(/*126.63*/{pageNo-2}),format.raw/*126.73*/("""">"""),_display_(/*126.76*/{pageNo - 2}),format.raw/*126.88*/("""</a></li>	    
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*127.57*/{url}),_display_(/*127.63*/{pageNo-1}),format.raw/*127.73*/("""">"""),_display_(/*127.76*/{pageNo - 1}),format.raw/*127.88*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*128.57*/{url}),_display_(/*128.63*/{pageNo}),format.raw/*128.71*/("""">"""),_display_(/*128.74*/pageNo),format.raw/*128.80*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*129.57*/{url}),_display_(/*129.63*/{pageNo+1}),format.raw/*129.73*/("""">"""),_display_(/*129.76*/{pageNo + 1}),format.raw/*129.88*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*130.57*/{url}),_display_(/*130.63*/{pageNo+2}),format.raw/*130.73*/("""">"""),_display_(/*130.76*/{pageNo + 2}),format.raw/*130.88*/("""</a></li>		    
	    """)))}),format.raw/*131.7*/("""
	    
	    """),format.raw/*133.6*/("""<li class="page-item">
	      """),_display_(/*134.9*/if(pageNo == 1)/*134.24*/{_display_(Seq[Any](format.raw/*134.25*/("""
            """),format.raw/*135.13*/("""<a class="page-link" href="#" aria-label="Next">
	      """)))}/*136.10*/else/*136.15*/{_display_(Seq[Any](format.raw/*136.16*/("""
	      	"""),format.raw/*137.9*/("""<a class="page-link" href=""""),_display_(/*137.37*/{url}),_display_(/*137.43*/{pageNo+1}),format.raw/*137.53*/("""" aria-label="Next">
	      """)))}),format.raw/*138.9*/("""
	        """),format.raw/*139.10*/("""<span aria-hidden="true">&raquo;</span>
	        <span class="sr-only">Next</span>
	      </a>
	    </li>
	  </ul>
	</nav>
""")))};def /*147.2*/erorr/*147.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*147.11*/("""
	"""),format.raw/*148.2*/("""<div style="text-align: center">
		"""),_display_(/*149.4*/if(status == "SocketTimeoutException")/*149.42*/{_display_(Seq[Any](format.raw/*149.43*/("""
			"""),format.raw/*150.4*/("""<h2>サイトのスクレイピング中にエラーが発生しました。</h2>
			<h2>画面の更新をお願いします。</h2>
		""")))}/*152.5*/else/*152.10*/{_display_(Seq[Any](format.raw/*152.11*/("""
			"""),_display_(/*153.5*/if(status != null && status != "first")/*153.44*/ {_display_(Seq[Any](format.raw/*153.46*/("""
				"""),format.raw/*154.5*/("""<h2>予期せぬエラーが発生しました。</h2>
				<h2>画面の更新をお願いします。</h2>
			""")))}),format.raw/*156.5*/("""
		""")))}),format.raw/*157.4*/("""	
	"""),format.raw/*158.2*/("""</div>
	
""")))};def /*2.2*/url/*2.5*/ = {{"https://house-site-scraping.herokuapp.com/page/"}};
Seq[Any](format.raw/*1.110*/("""
"""),format.raw/*2.60*/("""

"""),_display_(/*4.2*/main("HouseHolder")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
	"""),_display_(/*5.3*/navi),format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div style="margin-top: 100px">
	"""),_display_(/*7.3*/if(status == "first")/*7.24*/{_display_(Seq[Any](format.raw/*7.25*/("""
		"""),_display_(/*8.4*/first),format.raw/*8.9*/("""
	""")))}),format.raw/*9.3*/("""
	"""),_display_(/*10.3*/if(status == null)/*10.21*/{_display_(Seq[Any](format.raw/*10.22*/("""
		"""),_display_(/*11.4*/list),format.raw/*11.8*/("""
		"""),_display_(/*12.4*/page),format.raw/*12.8*/("""
	""")))}),format.raw/*13.3*/("""
	"""),_display_(/*14.3*/erorr),format.raw/*14.8*/("""
	"""),format.raw/*15.2*/("""</div>
""")))}),format.raw/*16.2*/("""
"""),format.raw/*59.2*/("""

"""),format.raw/*67.2*/("""

"""),format.raw/*104.2*/("""

"""),format.raw/*145.2*/("""

"""))
      }
    }
  }

  def render(elaListMap:List[Map[String, String]],viewListMap:List[Map[String, String]],pageNo:Int,status:String): play.twirl.api.HtmlFormat.Appendable = apply(elaListMap,viewListMap,pageNo,status)

  def f:((List[Map[String, String]],List[Map[String, String]],Int,String) => play.twirl.api.HtmlFormat.Appendable) = (elaListMap,viewListMap,pageNo,status) => apply(elaListMap,viewListMap,pageNo,status)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun May 21 02:12:48 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: 3afd6aeacd7c43f9402398b60a6e87bc35bd2c0d
                  MATRIX: 583->1|770->330|782->334|863->338|895->343|2409->1837|2422->1842|2503->1846|2532->1848|2716->2012|2728->2016|2809->2020|2838->2022|2903->2061|2944->2086|2983->2087|3013->2090|3077->2127|3115->2144|3193->2195|3226->2207|3302->2256|3333->2266|3492->2399|3539->2437|3578->2438|3611->2445|3647->2460|3671->2467|3684->2472|3723->2473|3756->2480|3792->2495|3821->2496|3851->2499|3887->2514|3923->2520|3954->2524|4059->2602|4094->2616|4201->2696|4236->2710|4357->2805|4404->2843|4443->2844|4476->2851|4512->2866|4536->2873|4549->2878|4588->2879|4621->2886|4657->2901|4686->2902|4716->2905|4752->2920|4788->2926|4820->2931|4943->3026|4982->3043|5031->3061|5061->3063|5093->3074|5106->3078|5188->3082|5218->3084|5371->3210|5396->3225|5436->3226|5478->3239|5559->3301|5573->3306|5613->3307|5650->3316|5706->3344|5733->3350|5765->3360|5829->3393|5868->3403|6011->3519|6051->3549|6091->3550|6123->3554|6201->3604|6228->3609|6326->3679|6353->3684|6451->3754|6478->3759|6576->3829|6603->3834|6701->3904|6728->3909|6767->3930|6781->3935|6821->3936|6856->3943|6934->3993|6961->3999|6993->4009|7024->4012|7058->4024|7157->4095|7184->4101|7216->4111|7247->4114|7281->4126|7375->4192|7402->4198|7432->4206|7463->4209|7491->4215|7585->4281|7612->4287|7644->4297|7675->4300|7709->4312|7803->4378|7830->4384|7862->4394|7893->4397|7927->4409|7980->4431|8020->4443|8078->4474|8103->4489|8143->4490|8185->4503|8262->4561|8276->4566|8316->4567|8353->4576|8409->4604|8436->4610|8468->4620|8528->4649|8567->4659|8715->4786|8729->4791|8811->4795|8841->4797|8904->4833|8952->4871|8992->4872|9024->4876|9106->4940|9120->4945|9160->4946|9192->4951|9241->4990|9282->4992|9315->4997|9402->5053|9437->5057|9468->5060|9500->111|9510->114|9596->109|9624->169|9652->172|9679->191|9717->192|9745->195|9768->199|9796->201|9855->235|9884->256|9922->257|9951->261|9975->266|10007->269|10036->272|10063->290|10102->291|10132->295|10156->299|10186->303|10210->307|10243->310|10272->313|10297->318|10326->320|10364->328|10392->1834|10421->2009|10451->3071|10481->4783
                  LINES: 20->1|24->17|24->17|26->17|27->18|68->61|68->61|70->61|71->62|76->69|76->69|78->69|79->70|81->72|81->72|81->72|82->73|83->74|83->74|84->75|84->75|85->76|85->76|89->80|89->80|89->80|90->81|90->81|91->82|91->82|91->82|92->83|92->83|92->83|92->83|92->83|93->84|94->85|96->87|96->87|98->89|98->89|101->92|101->92|101->92|102->93|102->93|103->94|103->94|103->94|104->95|104->95|104->95|104->95|104->95|105->96|106->97|109->100|109->100|111->102|112->103|113->106|113->106|115->106|116->107|119->110|119->110|119->110|120->111|121->112|121->112|121->112|122->113|122->113|122->113|122->113|123->114|124->115|128->119|128->119|128->119|129->120|129->120|129->120|130->121|130->121|131->122|131->122|132->123|132->123|133->124|133->124|134->125|134->125|134->125|135->126|135->126|135->126|135->126|135->126|135->126|136->127|136->127|136->127|136->127|136->127|137->128|137->128|137->128|137->128|137->128|138->129|138->129|138->129|138->129|138->129|139->130|139->130|139->130|139->130|139->130|140->131|142->133|143->134|143->134|143->134|144->135|145->136|145->136|145->136|146->137|146->137|146->137|146->137|147->138|148->139|154->147|154->147|156->147|157->148|158->149|158->149|158->149|159->150|161->152|161->152|161->152|162->153|162->153|162->153|163->154|165->156|166->157|167->158|169->2|169->2|170->1|171->2|173->4|173->4|173->4|174->5|174->5|175->6|176->7|176->7|176->7|177->8|177->8|178->9|179->10|179->10|179->10|180->11|180->11|181->12|181->12|182->13|183->14|183->14|184->15|185->16|186->59|188->67|190->104|192->145
                  -- GENERATED --
              */
          