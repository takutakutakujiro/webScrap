
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

					"""),_display_(/*83.7*/if(serchedSUMO)/*83.22*/{_display_(Seq[Any](format.raw/*83.23*/("""
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
				""")))}),format.raw/*117.6*/("""万円
			</div>
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
	
""")))};def /*5.2*/viewListMap/*5.13*/ = {{sessionBean.viewListMap}};def /*6.2*/status/*6.8*/ = {{sessionBean.status}};def /*7.2*/currentPageNumber/*7.19*/ = {{sessionBean.currentPageNumber}};def /*8.2*/serchedSUMO/*8.13*/ = {{sessionBean.checkedSiteModel.sumo}};def /*9.2*/url/*9.5*/ = {{"http://localhost:9000/page/"}};
Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*6.32*/("""
"""),format.raw/*7.54*/("""
"""),format.raw/*8.52*/("""
"""),format.raw/*9.40*/("""

"""),format.raw/*11.1*/("""<!--"""),format.raw/*11.60*/("""-->
	
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
                  DATE: Thu Aug 24 15:47:00 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: 33e05cd24438adf5f99c0f502daf89f190389123
                  MATRIX: 575->18|680->473|694->479|775->483|804->485|877->538|889->542|970->546|1002->551|2516->2045|2528->2049|2609->2053|2638->2055|2809->2200|2833->2215|2872->2216|2906->2223|3040->2340|3053->2345|3092->2346|3126->2353|3264->2461|3296->2466|3467->2616|3480->2620|3562->2624|3592->2626|3658->2665|3700->2690|3740->2691|3771->2694|3836->2731|3875->2748|3958->2803|3991->2814|4068->2863|4102->2875|4201->2946|4233->2956|4439->3135|4487->3173|4527->3174|4561->3181|4598->3196|4623->3203|4637->3208|4677->3209|4711->3216|4748->3231|4778->3232|4809->3235|4846->3250|4883->3256|5023->3368|5059->3382|5195->3490|5231->3504|5381->3627|5429->3665|5469->3666|5503->3673|5540->3688|5565->3695|5579->3700|5619->3701|5653->3708|5690->3723|5720->3724|5751->3727|5788->3742|5825->3748|5858->3753|6033->3900|6072->3917|6121->3935|6151->3937|6183->3948|6196->3952|6278->3956|6308->3958|6461->4084|6497->4110|6537->4111|6579->4124|6660->4186|6674->4191|6714->4192|6751->4201|6807->4229|6834->4235|6877->4256|6941->4289|6980->4299|7123->4415|7185->4467|7225->4468|7257->4472|7335->4522|7362->4527|7460->4597|7487->4602|7585->4672|7612->4677|7710->4747|7737->4752|7835->4822|7862->4827|7901->4848|7915->4853|7955->4854|7990->4861|8068->4911|8095->4917|8138->4938|8169->4941|8215->4964|8309->5030|8336->5036|8379->5057|8410->5060|8456->5083|8550->5149|8577->5155|8618->5174|8649->5177|8689->5194|8783->5260|8810->5266|8853->5287|8884->5290|8930->5313|9024->5379|9051->5385|9094->5406|9125->5409|9171->5432|9218->5448|9258->5460|9316->5491|9352->5517|9392->5518|9434->5531|9511->5589|9525->5594|9565->5595|9602->5604|9658->5632|9685->5638|9728->5659|9788->5688|9827->5698|9975->5825|9989->5830|10071->5834|10101->5836|10164->5872|10212->5910|10252->5911|10284->5915|10366->5979|10380->5984|10420->5985|10452->5990|10501->6029|10542->6031|10575->6036|10662->6092|10697->6096|10728->6099|10760->47|10779->58|10821->89|10834->95|10871->121|10896->138|10944->175|10963->186|11015->227|11025->230|11090->44|11119->87|11147->119|11175->173|11203->225|11231->265|11260->267|11292->326|11325->333|11350->349|11389->350|11418->353|11444->359|11473->361|11524->386|11548->390|11578->394|11611->418|11650->419|11681->424|11705->428|11736->433|11760->437|11782->441|11794->445|11832->446|11863->451|11889->456|11923->460|11952->462|11990->470|12019->535|12048->2042|12077->2613|12107->3945|12137->5822
                  LINES: 23->3|27->26|27->26|29->26|30->27|33->32|33->32|35->32|36->33|77->76|77->76|79->76|80->77|86->83|86->83|86->83|87->84|90->87|90->87|90->87|91->88|94->91|95->92|102->101|102->101|104->101|105->102|107->104|107->104|107->104|108->105|109->106|109->106|110->107|110->107|111->108|111->108|112->109|112->109|116->113|116->113|116->113|117->114|117->114|118->115|118->115|118->115|119->116|119->116|119->116|119->116|119->116|120->117|123->120|123->120|125->122|125->122|128->125|128->125|128->125|129->126|129->126|130->127|130->127|130->127|131->128|131->128|131->128|131->128|131->128|132->129|133->130|136->133|136->133|138->135|139->136|140->139|140->139|142->139|143->140|146->143|146->143|146->143|147->144|148->145|148->145|148->145|149->146|149->146|149->146|149->146|150->147|151->148|155->152|155->152|155->152|156->153|156->153|156->153|157->154|157->154|158->155|158->155|159->156|159->156|160->157|160->157|161->158|161->158|161->158|162->159|162->159|162->159|162->159|162->159|162->159|163->160|163->160|163->160|163->160|163->160|164->161|164->161|164->161|164->161|164->161|165->162|165->162|165->162|165->162|165->162|166->163|166->163|166->163|166->163|166->163|167->164|169->166|170->167|170->167|170->167|171->168|172->169|172->169|172->169|173->170|173->170|173->170|173->170|174->171|175->172|181->180|181->180|183->180|184->181|185->182|185->182|185->182|186->183|188->185|188->185|188->185|189->186|189->186|189->186|190->187|192->189|193->190|194->191|196->5|196->5|196->6|196->6|196->7|196->7|196->8|196->8|196->9|196->9|197->3|199->5|200->6|201->7|202->8|203->9|205->11|205->11|207->13|207->13|207->13|208->14|208->14|209->15|210->16|210->16|211->17|211->17|211->17|212->18|212->18|213->19|213->19|214->20|214->20|214->20|215->21|215->21|216->22|217->23|218->24|220->30|222->74|224->99|226->137|228->178
                  -- GENERATED --
              */
          