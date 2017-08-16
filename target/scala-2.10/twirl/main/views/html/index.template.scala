
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

def /*16.2*/header/*16.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.12*/("""
	"""),format.raw/*17.2*/("""<div class="header">
		<h2>世田谷House</h2>
	</div>
""")))};def /*22.2*/navi/*22.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
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
""")))};def /*66.2*/form/*66.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*66.10*/("""
	"""),format.raw/*67.2*/("""<div class="form">
		<form method="POST">
			<div class="block">
				<div class="checkboxs-title">サイト選択</div>
				<div class="checkboxs">
					<label class="checkbox-inline">
						<input type="checkbox" name="sumo" value=1>SUMO
					</label>
				</div>
				<div class="scripbtn">
					<button type="submit" class="btn btn-success">スクレイピングスタート！</button>
				</div>
			</div>
		</form>
	</div>
""")))};def /*84.2*/list/*84.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*84.10*/("""
	"""),format.raw/*85.2*/("""<div class="property_unit-content">

	"""),_display_(/*87.3*/for( map <- viewListMap ) yield /*87.28*/{_display_(Seq[Any](format.raw/*87.29*/("""
		"""),format.raw/*88.3*/("""<div class="container">
			<a href=""""),_display_(/*89.14*/map("detail_url")),format.raw/*89.31*/("""" target="_blank">
				<div class="col-md-1 col-xs-1">"""),_display_(/*90.37*/map("site")),format.raw/*90.48*/("""</div>
				<div class="col-md-11 col-xs-11"><h4>"""),_display_(/*91.43*/map("title")),format.raw/*91.55*/("""</h4></div>
				<div class="col-md-4 col-xs-12 mobile-img" ><img src=""""),_display_(/*92.60*/map("img")),format.raw/*92.70*/("""" rel="" alt="" width="192" height="144"></div>
			</a>
			<div class="col-md-2 col-xs-6 item item-left item-top">販売価格</div>
			<div class="col-md-6 col-xs-6 item item-top">
				"""),_display_(/*96.6*/if(map("minPrice") == map("maxPrice"))/*96.44*/{_display_(Seq[Any](format.raw/*96.45*/("""
					"""),_display_(/*97.7*/map("minPrice")),format.raw/*97.22*/("""
				""")))}/*98.7*/else/*98.12*/{_display_(Seq[Any](format.raw/*98.13*/("""
					"""),_display_(/*99.7*/map("minPrice")),format.raw/*99.22*/(""" """),format.raw/*99.23*/("""~ """),_display_(/*99.26*/map("maxPrice")),format.raw/*99.41*/("""
				""")))}),format.raw/*100.6*/("""万円
			</div>
			<div class="col-md-2 col-xs-6 item item-left">所在地</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*103.41*/map("address")),format.raw/*103.55*/("""</div>	
			<div class="col-md-2 col-xs-6 item item-left">沿線・駅</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*105.41*/map("station")),format.raw/*105.55*/("""</div>											
			<div class="col-md-2 col-xs-6 item item-left">土地面積</div>
			<div class="col-md-6 col-xs-6 item">
				"""),_display_(/*108.6*/if(map("minSpace") == map("maxSpace"))/*108.44*/{_display_(Seq[Any](format.raw/*108.45*/("""
					"""),_display_(/*109.7*/map("minSpace")),format.raw/*109.22*/("""
				""")))}/*110.7*/else/*110.12*/{_display_(Seq[Any](format.raw/*110.13*/("""
					"""),_display_(/*111.7*/map("minSpace")),format.raw/*111.22*/(""" """),format.raw/*111.23*/("""~ """),_display_(/*111.26*/map("maxSpace")),format.raw/*111.41*/("""
				""")))}),format.raw/*112.6*/("""
				"""),format.raw/*113.5*/("""m<sup>2</sup>
			</div>
			<div class="col-md-2 col-xs-6 item item-bottom item-left">間取り</div>
			<div class="col-md-2 col-xs-6 item item-bottom">"""),_display_(/*116.53*/map("roomLayout")),format.raw/*116.70*/("""</div>
		</div>
	""")))}),format.raw/*118.3*/("""
	"""),format.raw/*119.2*/("""</div>
""")))};def /*122.2*/page/*122.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*122.10*/("""
	"""),format.raw/*123.2*/("""<nav class="pagecontent" aria-label="Page navigation example">
	  <ul class="pagination">
	    <li class="page-item">
	      """),_display_(/*126.9*/if(pageNo == 1)/*126.24*/{_display_(Seq[Any](format.raw/*126.25*/("""
            """),format.raw/*127.13*/("""<a class="page-link" href="#" aria-label="Previous">
	      """)))}/*128.10*/else/*128.15*/{_display_(Seq[Any](format.raw/*128.16*/("""
	      	"""),format.raw/*129.9*/("""<a class="page-link" href=""""),_display_(/*129.37*/{url}),_display_(/*129.43*/{pageNo-1}),format.raw/*129.53*/("""" aria-label="Previous">
	      """)))}),format.raw/*130.9*/("""
	        """),format.raw/*131.10*/("""<span aria-hidden="true">&laquo;</span>
	        <span class="sr-only">Previous</span>
	      </a>
	    </li>
	    """),_display_(/*135.7*/if(pageNo == 1 || pageNo == 2)/*135.37*/{_display_(Seq[Any](format.raw/*135.38*/("""
			"""),format.raw/*136.4*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*136.54*/{url}),format.raw/*136.59*/("""1">1</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*137.57*/{url}),format.raw/*137.62*/("""2">2</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*138.57*/{url}),format.raw/*138.62*/("""3">3</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*139.57*/{url}),format.raw/*139.62*/("""4">4</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*140.57*/{url}),format.raw/*140.62*/("""5">5</a></li>
	    """)))}/*141.8*/else/*141.13*/{_display_(Seq[Any](format.raw/*141.14*/("""
	    	"""),format.raw/*142.7*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*142.57*/{url}),_display_(/*142.63*/{pageNo-2}),format.raw/*142.73*/("""">"""),_display_(/*142.76*/{pageNo - 2}),format.raw/*142.88*/("""</a></li>	    
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*143.57*/{url}),_display_(/*143.63*/{pageNo-1}),format.raw/*143.73*/("""">"""),_display_(/*143.76*/{pageNo - 1}),format.raw/*143.88*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*144.57*/{url}),_display_(/*144.63*/{pageNo}),format.raw/*144.71*/("""">"""),_display_(/*144.74*/pageNo),format.raw/*144.80*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*145.57*/{url}),_display_(/*145.63*/{pageNo+1}),format.raw/*145.73*/("""">"""),_display_(/*145.76*/{pageNo + 1}),format.raw/*145.88*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*146.57*/{url}),_display_(/*146.63*/{pageNo+2}),format.raw/*146.73*/("""">"""),_display_(/*146.76*/{pageNo + 2}),format.raw/*146.88*/("""</a></li>		    
	    """)))}),format.raw/*147.7*/("""
	    
	    """),format.raw/*149.6*/("""<li class="page-item">
	      """),_display_(/*150.9*/if(pageNo == 1)/*150.24*/{_display_(Seq[Any](format.raw/*150.25*/("""
            """),format.raw/*151.13*/("""<a class="page-link" href="#" aria-label="Next">
	      """)))}/*152.10*/else/*152.15*/{_display_(Seq[Any](format.raw/*152.16*/("""
	      	"""),format.raw/*153.9*/("""<a class="page-link" href=""""),_display_(/*153.37*/{url}),_display_(/*153.43*/{pageNo+1}),format.raw/*153.53*/("""" aria-label="Next">
	      """)))}),format.raw/*154.9*/("""
	        """),format.raw/*155.10*/("""<span aria-hidden="true">&raquo;</span>
	        <span class="sr-only">Next</span>
	      </a>
	    </li>
	  </ul>
	</nav>
""")))};def /*163.2*/erorr/*163.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*163.11*/("""
	"""),format.raw/*164.2*/("""<div style="text-align: center">
		"""),_display_(/*165.4*/if(status == "SocketTimeoutException")/*165.42*/{_display_(Seq[Any](format.raw/*165.43*/("""
			"""),format.raw/*166.4*/("""<h2>サイトのスクレイピング中にエラーが発生しました。</h2>
			<h2>画面の更新をお願いします。</h2>
		""")))}/*168.5*/else/*168.10*/{_display_(Seq[Any](format.raw/*168.11*/("""
			"""),_display_(/*169.5*/if(status != null && status != "first")/*169.44*/ {_display_(Seq[Any](format.raw/*169.46*/("""
				"""),format.raw/*170.5*/("""<h2>予期せぬエラーが発生しました。</h2>
				<h2>画面の更新をお願いします。</h2>
			""")))}),format.raw/*172.5*/("""
		""")))}),format.raw/*173.4*/("""	
	"""),format.raw/*174.2*/("""</div>
	
""")))};def /*2.2*/url/*2.5*/ = {{"https://house-site-scraping.herokuapp.com/page/"}};
Seq[Any](format.raw/*1.110*/("""
"""),format.raw/*2.60*/("""

"""),_display_(/*4.2*/main("世田谷House")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
	"""),_display_(/*5.3*/header),format.raw/*5.9*/("""
	"""),format.raw/*6.2*/("""<div class="content">
		"""),_display_(/*7.4*/form),format.raw/*7.8*/("""
		"""),_display_(/*8.4*/if(status == null)/*8.22*/{_display_(Seq[Any](format.raw/*8.23*/("""
			"""),_display_(/*9.5*/list),format.raw/*9.9*/("""
			"""),_display_(/*10.5*/page),format.raw/*10.9*/("""
		""")))}),format.raw/*11.4*/("""
		"""),_display_(/*12.4*/erorr),format.raw/*12.9*/("""
	"""),format.raw/*13.2*/("""</div>
""")))}),format.raw/*14.2*/("""

"""),format.raw/*20.2*/("""

"""),format.raw/*64.2*/("""

"""),format.raw/*82.2*/("""

"""),format.raw/*120.2*/("""

"""),format.raw/*161.2*/("""

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
                  DATE: Thu Aug 17 02:29:01 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: d4291dc69ed6f1e66c64a860cbf2d2ace194a802
                  MATRIX: 583->1|770->296|784->302|865->306|894->308|967->361|979->365|1060->369|1092->374|2606->1868|2618->1872|2699->1876|2728->1878|3145->2275|3157->2279|3238->2283|3267->2285|3332->2324|3373->2349|3412->2350|3442->2353|3506->2390|3544->2407|3626->2462|3658->2473|3734->2522|3767->2534|3865->2605|3896->2615|4101->2794|4148->2832|4187->2833|4220->2840|4256->2855|4280->2862|4293->2867|4332->2868|4365->2875|4401->2890|4430->2891|4460->2894|4496->2909|4533->2915|4673->3027|4709->3041|4845->3149|4881->3163|5031->3286|5079->3324|5119->3325|5153->3332|5190->3347|5215->3354|5229->3359|5269->3360|5303->3367|5340->3382|5370->3383|5401->3386|5438->3401|5475->3407|5508->3412|5683->3559|5722->3576|5771->3594|5801->3596|5833->3607|5846->3611|5928->3615|5958->3617|6111->3743|6136->3758|6176->3759|6218->3772|6299->3834|6313->3839|6353->3840|6390->3849|6446->3877|6473->3883|6505->3893|6569->3926|6608->3936|6751->4052|6791->4082|6831->4083|6863->4087|6941->4137|6968->4142|7066->4212|7093->4217|7191->4287|7218->4292|7316->4362|7343->4367|7441->4437|7468->4442|7507->4463|7521->4468|7561->4469|7596->4476|7674->4526|7701->4532|7733->4542|7764->4545|7798->4557|7897->4628|7924->4634|7956->4644|7987->4647|8021->4659|8115->4725|8142->4731|8172->4739|8203->4742|8231->4748|8325->4814|8352->4820|8384->4830|8415->4833|8449->4845|8543->4911|8570->4917|8602->4927|8633->4930|8667->4942|8720->4964|8760->4976|8818->5007|8843->5022|8883->5023|8925->5036|9002->5094|9016->5099|9056->5100|9093->5109|9149->5137|9176->5143|9208->5153|9268->5182|9307->5192|9455->5319|9469->5324|9551->5328|9581->5330|9644->5366|9692->5404|9732->5405|9764->5409|9846->5473|9860->5478|9900->5479|9932->5484|9981->5523|10022->5525|10055->5530|10142->5586|10177->5590|10208->5593|10240->111|10250->114|10336->109|10364->169|10392->172|10416->188|10454->189|10482->192|10507->198|10535->200|10585->225|10608->229|10637->233|10663->251|10701->252|10731->257|10754->261|10785->266|10809->270|10843->274|10873->278|10898->283|10927->285|10965->293|10994->358|11023->1865|11052->2272|11082->3604|11112->5316
                  LINES: 20->1|24->16|24->16|26->16|27->17|30->22|30->22|32->22|33->23|74->66|74->66|76->66|77->67|92->84|92->84|94->84|95->85|97->87|97->87|97->87|98->88|99->89|99->89|100->90|100->90|101->91|101->91|102->92|102->92|106->96|106->96|106->96|107->97|107->97|108->98|108->98|108->98|109->99|109->99|109->99|109->99|109->99|110->100|113->103|113->103|115->105|115->105|118->108|118->108|118->108|119->109|119->109|120->110|120->110|120->110|121->111|121->111|121->111|121->111|121->111|122->112|123->113|126->116|126->116|128->118|129->119|130->122|130->122|132->122|133->123|136->126|136->126|136->126|137->127|138->128|138->128|138->128|139->129|139->129|139->129|139->129|140->130|141->131|145->135|145->135|145->135|146->136|146->136|146->136|147->137|147->137|148->138|148->138|149->139|149->139|150->140|150->140|151->141|151->141|151->141|152->142|152->142|152->142|152->142|152->142|152->142|153->143|153->143|153->143|153->143|153->143|154->144|154->144|154->144|154->144|154->144|155->145|155->145|155->145|155->145|155->145|156->146|156->146|156->146|156->146|156->146|157->147|159->149|160->150|160->150|160->150|161->151|162->152|162->152|162->152|163->153|163->153|163->153|163->153|164->154|165->155|171->163|171->163|173->163|174->164|175->165|175->165|175->165|176->166|178->168|178->168|178->168|179->169|179->169|179->169|180->170|182->172|183->173|184->174|186->2|186->2|187->1|188->2|190->4|190->4|190->4|191->5|191->5|192->6|193->7|193->7|194->8|194->8|194->8|195->9|195->9|196->10|196->10|197->11|198->12|198->12|199->13|200->14|202->20|204->64|206->82|208->120|210->161
                  -- GENERATED --
              */
          