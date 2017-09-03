
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

     object index_Scope1 {
import model._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SessionBean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(sessionBean: SessionBean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*26.2*/header/*26.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.12*/("""
	"""),format.raw/*27.2*/("""<div class="header">
		<h2>世田谷House</h2>
	</div>
""")))};def /*32.2*/navi/*32.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
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
""")))};def /*76.2*/form/*76.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*76.10*/("""
	"""),format.raw/*77.2*/("""<div class="form">
		<form method="POST">
			<div class="block">
				<div class="checkboxs-title">サイト選択</div>
				<div class="checkboxs">

					"""),_display_(/*83.7*/if(searchedSUMO)/*83.23*/{_display_(Seq[Any](format.raw/*83.24*/("""
						"""),format.raw/*84.7*/("""<label class="checkbox-inline">
							<input type="checkbox" name="sumo" value=1 checked>SUMO
						</label>
					""")))}/*87.8*/else/*87.13*/{_display_(Seq[Any](format.raw/*87.14*/("""
						"""),format.raw/*88.7*/("""<label class="checkbox-inline">
							<input type="checkbox" name="sumo" value=1>SUMO
						</label>
					""")))}),format.raw/*91.7*/("""
				"""),format.raw/*92.5*/("""</div>
				<div class="scripbtn">
					<button type="submit" class="btn btn-success">スクレイピングスタート！</button>
				</div>
			</div>
		</form>
	</div>
""")))};def /*101.2*/list/*101.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*101.10*/("""
	"""),format.raw/*102.2*/("""<div class="property_unit-content">

	"""),_display_(/*104.3*/for( map <- viewListMap ) yield /*104.28*/{_display_(Seq[Any](format.raw/*104.29*/("""
		"""),format.raw/*105.3*/("""<div class="container">
			<a href=""""),_display_(/*106.14*/map("detail_url")),format.raw/*106.31*/("""" target="_blank">
				<div class="col-md-1 col-xs-1">"""),_display_(/*107.37*/map("site")),format.raw/*107.48*/("""</div>
				<div class="col-md-11 col-xs-11"><h4>"""),_display_(/*108.43*/map("title")),format.raw/*108.55*/("""</h4></div>
				<div class="col-md-4 col-xs-12 mobile-img" ><img src=""""),_display_(/*109.60*/map("img")),format.raw/*109.70*/("""" rel="" alt="" width="192" height="144"></div>
			</a>
			<div class="col-md-2 col-xs-6 item item-left item-top">販売価格</div>
			<div class="col-md-6 col-xs-6 item item-top">
				"""),_display_(/*113.6*/if(map("minPrice") == map("maxPrice"))/*113.44*/{_display_(Seq[Any](format.raw/*113.45*/("""
					"""),_display_(/*114.7*/map("minPrice")),format.raw/*114.22*/("""
				""")))}/*115.7*/else/*115.12*/{_display_(Seq[Any](format.raw/*115.13*/("""
					"""),_display_(/*116.7*/map("minPrice")),format.raw/*116.22*/(""" """),format.raw/*116.23*/("""~ """),_display_(/*116.26*/map("maxPrice")),format.raw/*116.41*/("""
				""")))}),format.raw/*117.6*/("""
			"""),format.raw/*118.4*/("""</div>
			<div class="col-md-2 col-xs-6 item item-left">所在地</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*120.41*/map("address")),format.raw/*120.55*/("""</div>	
			<div class="col-md-2 col-xs-6 item item-left">沿線・駅</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*122.41*/map("station")),format.raw/*122.55*/("""</div>											
			<div class="col-md-2 col-xs-6 item item-left">土地面積</div>
			<div class="col-md-6 col-xs-6 item">
				"""),_display_(/*125.6*/if(map("minSpace") == map("maxSpace"))/*125.44*/{_display_(Seq[Any](format.raw/*125.45*/("""
					"""),_display_(/*126.7*/map("minSpace")),format.raw/*126.22*/("""
				""")))}/*127.7*/else/*127.12*/{_display_(Seq[Any](format.raw/*127.13*/("""
					"""),_display_(/*128.7*/map("minSpace")),format.raw/*128.22*/(""" """),format.raw/*128.23*/("""~ """),_display_(/*128.26*/map("maxSpace")),format.raw/*128.41*/("""
				""")))}),format.raw/*129.6*/("""
				"""),format.raw/*130.5*/("""m<sup>2</sup>
			</div>
			<div class="col-md-2 col-xs-6 item item-bottom item-left">間取り</div>
			<div class="col-md-2 col-xs-6 item item-bottom">"""),_display_(/*133.53*/map("roomLayout")),format.raw/*133.70*/("""</div>
		</div>
	""")))}),format.raw/*135.3*/("""
	"""),format.raw/*136.2*/("""</div>
""")))};def /*139.2*/page/*139.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*139.10*/("""
	"""),format.raw/*140.2*/("""<nav class="pagecontent" aria-label="Page navigation example">
	  <ul class="pagination">
	    <li class="page-item">
	      """),_display_(/*143.9*/if(currentPageNumber == 1)/*143.35*/{_display_(Seq[Any](format.raw/*143.36*/("""
            """),format.raw/*144.13*/("""<a class="page-link" href="#" aria-label="Previous">
	      """)))}/*145.10*/else/*145.15*/{_display_(Seq[Any](format.raw/*145.16*/("""
	      	"""),format.raw/*146.9*/("""<a class="page-link" href=""""),_display_(/*146.37*/{url}),_display_(/*146.43*/{currentPageNumber-1}),format.raw/*146.64*/("""" aria-label="Previous">
	      """)))}),format.raw/*147.9*/("""
	        """),format.raw/*148.10*/("""<span aria-hidden="true">&laquo;</span>
	        <span class="sr-only">Previous</span>
	      </a>
	    </li>
	    """),_display_(/*152.7*/if(currentPageNumber == 1 || currentPageNumber == 2)/*152.59*/{_display_(Seq[Any](format.raw/*152.60*/("""
			"""),format.raw/*153.4*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*153.54*/{url}),format.raw/*153.59*/("""1">1</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*154.57*/{url}),format.raw/*154.62*/("""2">2</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*155.57*/{url}),format.raw/*155.62*/("""3">3</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*156.57*/{url}),format.raw/*156.62*/("""4">4</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*157.57*/{url}),format.raw/*157.62*/("""5">5</a></li>
	    """)))}/*158.8*/else/*158.13*/{_display_(Seq[Any](format.raw/*158.14*/("""
	    	"""),format.raw/*159.7*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*159.57*/{url}),_display_(/*159.63*/{currentPageNumber-2}),format.raw/*159.84*/("""">"""),_display_(/*159.87*/{currentPageNumber - 2}),format.raw/*159.110*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*160.57*/{url}),_display_(/*160.63*/{currentPageNumber-1}),format.raw/*160.84*/("""">"""),_display_(/*160.87*/{currentPageNumber - 1}),format.raw/*160.110*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*161.57*/{url}),_display_(/*161.63*/{currentPageNumber}),format.raw/*161.82*/("""">"""),_display_(/*161.85*/currentPageNumber),format.raw/*161.102*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*162.57*/{url}),_display_(/*162.63*/{currentPageNumber+1}),format.raw/*162.84*/("""">"""),_display_(/*162.87*/{currentPageNumber + 1}),format.raw/*162.110*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*163.57*/{url}),_display_(/*163.63*/{currentPageNumber+2}),format.raw/*163.84*/("""">"""),_display_(/*163.87*/{currentPageNumber + 2}),format.raw/*163.110*/("""</a></li>
	    """)))}),format.raw/*164.7*/("""
	    
	    """),format.raw/*166.6*/("""<li class="page-item">
	      """),_display_(/*167.9*/if(currentPageNumber == 1)/*167.35*/{_display_(Seq[Any](format.raw/*167.36*/("""
            """),format.raw/*168.13*/("""<a class="page-link" href="#" aria-label="Next">
	      """)))}/*169.10*/else/*169.15*/{_display_(Seq[Any](format.raw/*169.16*/("""
	      	"""),format.raw/*170.9*/("""<a class="page-link" href=""""),_display_(/*170.37*/{url}),_display_(/*170.43*/{currentPageNumber+1}),format.raw/*170.64*/("""" aria-label="Next">
	      """)))}),format.raw/*171.9*/("""
	        """),format.raw/*172.10*/("""<span aria-hidden="true">&raquo;</span>
	        <span class="sr-only">Next</span>
	      </a>
	    </li>
	  </ul>
	</nav>
""")))};def /*180.2*/erorr/*180.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*180.11*/("""
	"""),format.raw/*181.2*/("""<div style="text-align: center">
		"""),_display_(/*182.4*/if(status == "SocketTimeoutException")/*182.42*/{_display_(Seq[Any](format.raw/*182.43*/("""
			"""),format.raw/*183.4*/("""<h2>サイトのスクレイピング中にエラーが発生しました。</h2>
			<h2>画面の更新をお願いします。</h2>
		""")))}/*185.5*/else/*185.10*/{_display_(Seq[Any](format.raw/*185.11*/("""
			"""),_display_(/*186.5*/if(status != null && status != "first")/*186.44*/ {_display_(Seq[Any](format.raw/*186.46*/("""
				"""),format.raw/*187.5*/("""<h2>予期せぬエラーが発生しました。</h2>
				<h2>画面の更新をお願いします。</h2>
			""")))}),format.raw/*189.5*/("""
		""")))}),format.raw/*190.4*/("""	
	"""),format.raw/*191.2*/("""</div>
	
""")))};def /*5.2*/viewListMap/*5.13*/ = {{sessionBean.viewListMap}};def /*6.2*/status/*6.8*/ = {{sessionBean.status}};def /*7.2*/currentPageNumber/*7.19*/ = {{sessionBean.currentPageNumber}};def /*8.2*/searchedSUMO/*8.14*/ = {{sessionBean.checkedSiteModel.sumo}};def /*11.2*/url/*11.5*/ = {{"http://localhost:9000/page/"}};
Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*6.32*/("""
"""),format.raw/*7.54*/("""
"""),format.raw/*8.53*/("""
"""),format.raw/*9.1*/("""<!--http://localhost:9000/page/-->
<!--https://house-site-scraping.herokuapp.com/page/-->
"""),format.raw/*11.40*/("""
	
"""),_display_(/*13.2*/main("世田谷House")/*13.18*/{_display_(Seq[Any](format.raw/*13.19*/("""
	"""),_display_(/*14.3*/header),format.raw/*14.9*/("""
	"""),format.raw/*15.2*/("""<div class="content">
		"""),_display_(/*16.4*/form),format.raw/*16.8*/("""
		"""),_display_(/*17.4*/if(status == "searched")/*17.28*/{_display_(Seq[Any](format.raw/*17.29*/("""
			"""),_display_(/*18.5*/list),format.raw/*18.9*/("""
			"""),_display_(/*19.5*/page),format.raw/*19.9*/("""
		""")))}/*20.4*/else/*20.8*/{_display_(Seq[Any](format.raw/*20.9*/("""
			"""),_display_(/*21.5*/erorr),format.raw/*21.10*/("""
		""")))}),format.raw/*22.4*/("""
	"""),format.raw/*23.2*/("""</div>
""")))}),format.raw/*24.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*74.2*/("""

"""),format.raw/*99.2*/("""

"""),format.raw/*137.2*/("""

"""),format.raw/*178.2*/("""

"""))
      }
    }
  }

  def render(sessionBean:SessionBean): play.twirl.api.HtmlFormat.Appendable = apply(sessionBean)

  def f:((SessionBean) => play.twirl.api.HtmlFormat.Appendable) = (sessionBean) => apply(sessionBean)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Sun Sep 03 22:26:11 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: d87d3cb1f05cd1f71f21994d3041168f8d53f903
                  MATRIX: 575->18|680->500|694->506|775->510|804->512|877->565|889->569|970->573|1002->578|2516->2072|2528->2076|2609->2080|2638->2082|2809->2227|2834->2243|2873->2244|2907->2251|3041->2368|3054->2373|3093->2374|3127->2381|3265->2489|3297->2494|3468->2644|3481->2648|3563->2652|3593->2654|3659->2693|3701->2718|3741->2719|3772->2722|3837->2759|3876->2776|3959->2831|3992->2842|4069->2891|4103->2903|4202->2974|4234->2984|4440->3163|4488->3201|4528->3202|4562->3209|4599->3224|4624->3231|4638->3236|4678->3237|4712->3244|4749->3259|4779->3260|4810->3263|4847->3278|4884->3284|4916->3288|5050->3394|5086->3408|5222->3516|5258->3530|5408->3653|5456->3691|5496->3692|5530->3699|5567->3714|5592->3721|5606->3726|5646->3727|5680->3734|5717->3749|5747->3750|5778->3753|5815->3768|5852->3774|5885->3779|6060->3926|6099->3943|6148->3961|6178->3963|6210->3974|6223->3978|6305->3982|6335->3984|6488->4110|6524->4136|6564->4137|6606->4150|6687->4212|6701->4217|6741->4218|6778->4227|6834->4255|6861->4261|6904->4282|6968->4315|7007->4325|7150->4441|7212->4493|7252->4494|7284->4498|7362->4548|7389->4553|7487->4623|7514->4628|7612->4698|7639->4703|7737->4773|7764->4778|7862->4848|7889->4853|7928->4874|7942->4879|7982->4880|8017->4887|8095->4937|8122->4943|8165->4964|8196->4967|8242->4990|8336->5056|8363->5062|8406->5083|8437->5086|8483->5109|8577->5175|8604->5181|8645->5200|8676->5203|8716->5220|8810->5286|8837->5292|8880->5313|8911->5316|8957->5339|9051->5405|9078->5411|9121->5432|9152->5435|9198->5458|9245->5474|9285->5486|9343->5517|9379->5543|9419->5544|9461->5557|9538->5615|9552->5620|9592->5621|9629->5630|9685->5658|9712->5664|9755->5685|9815->5714|9854->5724|10002->5851|10016->5856|10098->5860|10128->5862|10191->5898|10239->5936|10279->5937|10311->5941|10393->6005|10407->6010|10447->6011|10479->6016|10528->6055|10569->6057|10602->6062|10689->6118|10724->6122|10755->6125|10787->47|10806->58|10848->89|10861->95|10898->121|10923->138|10971->175|10991->187|11044->318|11055->321|11120->44|11149->87|11177->119|11205->173|11233->226|11260->227|11378->356|11408->360|11433->376|11472->377|11501->380|11527->386|11556->388|11607->413|11631->417|11661->421|11694->445|11733->446|11764->451|11788->455|11819->460|11843->464|11865->468|11877->472|11915->473|11946->478|11972->483|12006->487|12035->489|12073->497|12102->562|12131->2069|12160->2641|12190->3971|12220->5848
                  LINES: 23->3|27->26|27->26|29->26|30->27|33->32|33->32|35->32|36->33|77->76|77->76|79->76|80->77|86->83|86->83|86->83|87->84|90->87|90->87|90->87|91->88|94->91|95->92|102->101|102->101|104->101|105->102|107->104|107->104|107->104|108->105|109->106|109->106|110->107|110->107|111->108|111->108|112->109|112->109|116->113|116->113|116->113|117->114|117->114|118->115|118->115|118->115|119->116|119->116|119->116|119->116|119->116|120->117|121->118|123->120|123->120|125->122|125->122|128->125|128->125|128->125|129->126|129->126|130->127|130->127|130->127|131->128|131->128|131->128|131->128|131->128|132->129|133->130|136->133|136->133|138->135|139->136|140->139|140->139|142->139|143->140|146->143|146->143|146->143|147->144|148->145|148->145|148->145|149->146|149->146|149->146|149->146|150->147|151->148|155->152|155->152|155->152|156->153|156->153|156->153|157->154|157->154|158->155|158->155|159->156|159->156|160->157|160->157|161->158|161->158|161->158|162->159|162->159|162->159|162->159|162->159|162->159|163->160|163->160|163->160|163->160|163->160|164->161|164->161|164->161|164->161|164->161|165->162|165->162|165->162|165->162|165->162|166->163|166->163|166->163|166->163|166->163|167->164|169->166|170->167|170->167|170->167|171->168|172->169|172->169|172->169|173->170|173->170|173->170|173->170|174->171|175->172|181->180|181->180|183->180|184->181|185->182|185->182|185->182|186->183|188->185|188->185|188->185|189->186|189->186|189->186|190->187|192->189|193->190|194->191|196->5|196->5|196->6|196->6|196->7|196->7|196->8|196->8|196->11|196->11|197->3|199->5|200->6|201->7|202->8|203->9|205->11|207->13|207->13|207->13|208->14|208->14|209->15|210->16|210->16|211->17|211->17|211->17|212->18|212->18|213->19|213->19|214->20|214->20|214->20|215->21|215->21|216->22|217->23|218->24|220->30|222->74|224->99|226->137|228->178
                  -- GENERATED --
              */
          