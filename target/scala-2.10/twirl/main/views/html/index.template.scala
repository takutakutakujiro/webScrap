
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
	
""")))};def /*5.2*/viewListMap/*5.13*/ = {{sessionBean.viewListMap}};def /*6.2*/status/*6.8*/ = {{sessionBean.status}};def /*7.2*/currentPageNumber/*7.19*/ = {{sessionBean.currentPageNumber}};def /*8.2*/searchedSUMO/*8.14*/ = {{sessionBean.checkedSiteModel.sumo}};def /*11.2*/url/*11.5*/ = {{"https://house-site-scraping.herokuapp.com/page/"}};
Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*6.32*/("""
"""),format.raw/*7.54*/("""
"""),format.raw/*8.53*/("""
"""),format.raw/*9.1*/("""<!--http://localhost:9000/page/-->
<!--https://house-site-scraping.herokuapp.com/page/-->
"""),format.raw/*11.60*/("""
	
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
                  DATE: Wed Sep 27 15:39:43 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: 455b4fca14d03dd628fb37ed54862dec969cf460
                  MATRIX: 575->18|680->520|694->526|775->530|804->532|877->585|889->589|970->593|1002->598|2516->2092|2528->2096|2609->2100|2638->2102|2809->2247|2834->2263|2873->2264|2907->2271|3041->2388|3054->2393|3093->2394|3127->2401|3265->2509|3297->2514|3468->2664|3481->2668|3563->2672|3593->2674|3659->2713|3701->2738|3741->2739|3772->2742|3837->2779|3876->2796|3959->2851|3992->2862|4069->2911|4103->2923|4202->2994|4234->3004|4440->3183|4488->3221|4528->3222|4562->3229|4599->3244|4624->3251|4638->3256|4678->3257|4712->3264|4749->3279|4779->3280|4810->3283|4847->3298|4884->3304|4916->3308|5050->3414|5086->3428|5222->3536|5258->3550|5408->3673|5456->3711|5496->3712|5530->3719|5567->3734|5592->3741|5606->3746|5646->3747|5680->3754|5717->3769|5747->3770|5778->3773|5815->3788|5852->3794|5885->3799|6060->3946|6099->3963|6148->3981|6178->3983|6210->3994|6223->3998|6305->4002|6335->4004|6488->4130|6524->4156|6564->4157|6606->4170|6687->4232|6701->4237|6741->4238|6778->4247|6834->4275|6861->4281|6904->4302|6968->4335|7007->4345|7150->4461|7212->4513|7252->4514|7284->4518|7362->4568|7389->4573|7487->4643|7514->4648|7612->4718|7639->4723|7737->4793|7764->4798|7862->4868|7889->4873|7928->4894|7942->4899|7982->4900|8017->4907|8095->4957|8122->4963|8165->4984|8196->4987|8242->5010|8336->5076|8363->5082|8406->5103|8437->5106|8483->5129|8577->5195|8604->5201|8645->5220|8676->5223|8716->5240|8810->5306|8837->5312|8880->5333|8911->5336|8957->5359|9051->5425|9078->5431|9121->5452|9152->5455|9198->5478|9245->5494|9285->5506|9343->5537|9379->5563|9419->5564|9461->5577|9538->5635|9552->5640|9592->5641|9629->5650|9685->5678|9712->5684|9755->5705|9815->5734|9854->5744|10002->5871|10016->5876|10098->5880|10128->5882|10191->5918|10239->5956|10279->5957|10311->5961|10393->6025|10407->6030|10447->6031|10479->6036|10528->6075|10569->6077|10602->6082|10689->6138|10724->6142|10755->6145|10787->47|10806->58|10848->89|10861->95|10898->121|10923->138|10971->175|10991->187|11044->318|11055->321|11140->44|11169->87|11197->119|11225->173|11253->226|11280->227|11398->376|11428->380|11453->396|11492->397|11521->400|11547->406|11576->408|11627->433|11651->437|11681->441|11714->465|11753->466|11784->471|11808->475|11839->480|11863->484|11885->488|11897->492|11935->493|11966->498|11992->503|12026->507|12055->509|12093->517|12122->582|12151->2089|12180->2661|12210->3991|12240->5868
                  LINES: 23->3|27->26|27->26|29->26|30->27|33->32|33->32|35->32|36->33|77->76|77->76|79->76|80->77|86->83|86->83|86->83|87->84|90->87|90->87|90->87|91->88|94->91|95->92|102->101|102->101|104->101|105->102|107->104|107->104|107->104|108->105|109->106|109->106|110->107|110->107|111->108|111->108|112->109|112->109|116->113|116->113|116->113|117->114|117->114|118->115|118->115|118->115|119->116|119->116|119->116|119->116|119->116|120->117|121->118|123->120|123->120|125->122|125->122|128->125|128->125|128->125|129->126|129->126|130->127|130->127|130->127|131->128|131->128|131->128|131->128|131->128|132->129|133->130|136->133|136->133|138->135|139->136|140->139|140->139|142->139|143->140|146->143|146->143|146->143|147->144|148->145|148->145|148->145|149->146|149->146|149->146|149->146|150->147|151->148|155->152|155->152|155->152|156->153|156->153|156->153|157->154|157->154|158->155|158->155|159->156|159->156|160->157|160->157|161->158|161->158|161->158|162->159|162->159|162->159|162->159|162->159|162->159|163->160|163->160|163->160|163->160|163->160|164->161|164->161|164->161|164->161|164->161|165->162|165->162|165->162|165->162|165->162|166->163|166->163|166->163|166->163|166->163|167->164|169->166|170->167|170->167|170->167|171->168|172->169|172->169|172->169|173->170|173->170|173->170|173->170|174->171|175->172|181->180|181->180|183->180|184->181|185->182|185->182|185->182|186->183|188->185|188->185|188->185|189->186|189->186|189->186|190->187|192->189|193->190|194->191|196->5|196->5|196->6|196->6|196->7|196->7|196->8|196->8|196->11|196->11|197->3|199->5|200->6|201->7|202->8|203->9|205->11|207->13|207->13|207->13|208->14|208->14|209->15|210->16|210->16|211->17|211->17|211->17|212->18|212->18|213->19|213->19|214->20|214->20|214->20|215->21|215->21|216->22|217->23|218->24|220->30|222->74|224->99|226->137|228->178
                  -- GENERATED --
              */
          