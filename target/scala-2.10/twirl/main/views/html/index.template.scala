
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

def /*25.2*/header/*25.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.12*/("""
	"""),format.raw/*26.2*/("""<div class="header">
		<h2>世田谷House</h2>
	</div>
""")))};def /*31.2*/navi/*31.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
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
""")))};def /*75.2*/form/*75.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*75.10*/("""
	"""),format.raw/*76.2*/("""<div class="form">
		<form method="POST">
			<div class="block">
				<div class="checkboxs-title">サイト選択</div>
				<div class="checkboxs">

					"""),_display_(/*82.7*/if(serchedSUMO)/*82.22*/{_display_(Seq[Any](format.raw/*82.23*/("""
						"""),format.raw/*83.7*/("""<label class="checkbox-inline">
							<input type="checkbox" name="sumo" value=1 checked>SUMO
						</label>
					""")))}/*86.8*/else/*86.13*/{_display_(Seq[Any](format.raw/*86.14*/("""
						"""),format.raw/*87.7*/("""<label class="checkbox-inline">
							<input type="checkbox" name="sumo" value=1>SUMO
						</label>
					""")))}),format.raw/*90.7*/("""
				"""),format.raw/*91.5*/("""</div>
				<div class="scripbtn">
					<button type="submit" class="btn btn-success">スクレイピングスタート！</button>
				</div>
			</div>
		</form>
	</div>
""")))};def /*100.2*/list/*100.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*100.10*/("""
	"""),format.raw/*101.2*/("""<div class="property_unit-content">

	"""),_display_(/*103.3*/for( map <- viewListMap ) yield /*103.28*/{_display_(Seq[Any](format.raw/*103.29*/("""
		"""),format.raw/*104.3*/("""<div class="container">
			<a href=""""),_display_(/*105.14*/map("detail_url")),format.raw/*105.31*/("""" target="_blank">
				<div class="col-md-1 col-xs-1">"""),_display_(/*106.37*/map("site")),format.raw/*106.48*/("""</div>
				<div class="col-md-11 col-xs-11"><h4>"""),_display_(/*107.43*/map("title")),format.raw/*107.55*/("""</h4></div>
				<div class="col-md-4 col-xs-12 mobile-img" ><img src=""""),_display_(/*108.60*/map("img")),format.raw/*108.70*/("""" rel="" alt="" width="192" height="144"></div>
			</a>
			<div class="col-md-2 col-xs-6 item item-left item-top">販売価格</div>
			<div class="col-md-6 col-xs-6 item item-top">
				"""),_display_(/*112.6*/if(map("minPrice") == map("maxPrice"))/*112.44*/{_display_(Seq[Any](format.raw/*112.45*/("""
					"""),_display_(/*113.7*/map("minPrice")),format.raw/*113.22*/("""
				""")))}/*114.7*/else/*114.12*/{_display_(Seq[Any](format.raw/*114.13*/("""
					"""),_display_(/*115.7*/map("minPrice")),format.raw/*115.22*/(""" """),format.raw/*115.23*/("""~ """),_display_(/*115.26*/map("maxPrice")),format.raw/*115.41*/("""
				""")))}),format.raw/*116.6*/("""万円
			</div>
			<div class="col-md-2 col-xs-6 item item-left">所在地</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*119.41*/map("address")),format.raw/*119.55*/("""</div>	
			<div class="col-md-2 col-xs-6 item item-left">沿線・駅</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*121.41*/map("station")),format.raw/*121.55*/("""</div>											
			<div class="col-md-2 col-xs-6 item item-left">土地面積</div>
			<div class="col-md-6 col-xs-6 item">
				"""),_display_(/*124.6*/if(map("minSpace") == map("maxSpace"))/*124.44*/{_display_(Seq[Any](format.raw/*124.45*/("""
					"""),_display_(/*125.7*/map("minSpace")),format.raw/*125.22*/("""
				""")))}/*126.7*/else/*126.12*/{_display_(Seq[Any](format.raw/*126.13*/("""
					"""),_display_(/*127.7*/map("minSpace")),format.raw/*127.22*/(""" """),format.raw/*127.23*/("""~ """),_display_(/*127.26*/map("maxSpace")),format.raw/*127.41*/("""
				""")))}),format.raw/*128.6*/("""
				"""),format.raw/*129.5*/("""m<sup>2</sup>
			</div>
			<div class="col-md-2 col-xs-6 item item-bottom item-left">間取り</div>
			<div class="col-md-2 col-xs-6 item item-bottom">"""),_display_(/*132.53*/map("roomLayout")),format.raw/*132.70*/("""</div>
		</div>
	""")))}),format.raw/*134.3*/("""
	"""),format.raw/*135.2*/("""</div>
""")))};def /*138.2*/page/*138.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*138.10*/("""
	"""),format.raw/*139.2*/("""<nav class="pagecontent" aria-label="Page navigation example">
	  <ul class="pagination">
	    <li class="page-item">
	      """),_display_(/*142.9*/if(currentPageNumber == 1)/*142.35*/{_display_(Seq[Any](format.raw/*142.36*/("""
            """),format.raw/*143.13*/("""<a class="page-link" href="#" aria-label="Previous">
	      """)))}/*144.10*/else/*144.15*/{_display_(Seq[Any](format.raw/*144.16*/("""
	      	"""),format.raw/*145.9*/("""<a class="page-link" href=""""),_display_(/*145.37*/{url}),_display_(/*145.43*/{currentPageNumber-1}),format.raw/*145.64*/("""" aria-label="Previous">
	      """)))}),format.raw/*146.9*/("""
	        """),format.raw/*147.10*/("""<span aria-hidden="true">&laquo;</span>
	        <span class="sr-only">Previous</span>
	      </a>
	    </li>
	    """),_display_(/*151.7*/if(currentPageNumber == 1 || currentPageNumber == 2)/*151.59*/{_display_(Seq[Any](format.raw/*151.60*/("""
			"""),format.raw/*152.4*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*152.54*/{url}),format.raw/*152.59*/("""1">1</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*153.57*/{url}),format.raw/*153.62*/("""2">2</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*154.57*/{url}),format.raw/*154.62*/("""3">3</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*155.57*/{url}),format.raw/*155.62*/("""4">4</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*156.57*/{url}),format.raw/*156.62*/("""5">5</a></li>
	    """)))}/*157.8*/else/*157.13*/{_display_(Seq[Any](format.raw/*157.14*/("""
	    	"""),format.raw/*158.7*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*158.57*/{url}),_display_(/*158.63*/{currentPageNumber-2}),format.raw/*158.84*/("""">"""),_display_(/*158.87*/{currentPageNumber - 2}),format.raw/*158.110*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*159.57*/{url}),_display_(/*159.63*/{currentPageNumber-1}),format.raw/*159.84*/("""">"""),_display_(/*159.87*/{currentPageNumber - 1}),format.raw/*159.110*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*160.57*/{url}),_display_(/*160.63*/{currentPageNumber}),format.raw/*160.82*/("""">"""),_display_(/*160.85*/currentPageNumber),format.raw/*160.102*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*161.57*/{url}),_display_(/*161.63*/{currentPageNumber+1}),format.raw/*161.84*/("""">"""),_display_(/*161.87*/{currentPageNumber + 1}),format.raw/*161.110*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*162.57*/{url}),_display_(/*162.63*/{currentPageNumber+2}),format.raw/*162.84*/("""">"""),_display_(/*162.87*/{currentPageNumber + 2}),format.raw/*162.110*/("""</a></li>
	    """)))}),format.raw/*163.7*/("""
	    
	    """),format.raw/*165.6*/("""<li class="page-item">
	      """),_display_(/*166.9*/if(currentPageNumber == 1)/*166.35*/{_display_(Seq[Any](format.raw/*166.36*/("""
            """),format.raw/*167.13*/("""<a class="page-link" href="#" aria-label="Next">
	      """)))}/*168.10*/else/*168.15*/{_display_(Seq[Any](format.raw/*168.16*/("""
	      	"""),format.raw/*169.9*/("""<a class="page-link" href=""""),_display_(/*169.37*/{url}),_display_(/*169.43*/{currentPageNumber+1}),format.raw/*169.64*/("""" aria-label="Next">
	      """)))}),format.raw/*170.9*/("""
	        """),format.raw/*171.10*/("""<span aria-hidden="true">&raquo;</span>
	        <span class="sr-only">Next</span>
	      </a>
	    </li>
	  </ul>
	</nav>
""")))};def /*179.2*/erorr/*179.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*179.11*/("""
	"""),format.raw/*180.2*/("""<div style="text-align: center">
		"""),_display_(/*181.4*/if(status == "SocketTimeoutException")/*181.42*/{_display_(Seq[Any](format.raw/*181.43*/("""
			"""),format.raw/*182.4*/("""<h2>サイトのスクレイピング中にエラーが発生しました。</h2>
			<h2>画面の更新をお願いします。</h2>
		""")))}/*184.5*/else/*184.10*/{_display_(Seq[Any](format.raw/*184.11*/("""
			"""),_display_(/*185.5*/if(status != null && status != "first")/*185.44*/ {_display_(Seq[Any](format.raw/*185.46*/("""
				"""),format.raw/*186.5*/("""<h2>予期せぬエラーが発生しました。</h2>
				<h2>画面の更新をお願いします。</h2>
			""")))}),format.raw/*188.5*/("""
		""")))}),format.raw/*189.4*/("""	
	"""),format.raw/*190.2*/("""</div>
	
""")))};def /*5.2*/viewListMap/*5.13*/ = {{sessionBean.viewListMap}};def /*6.2*/status/*6.8*/ = {{sessionBean.status}};def /*7.2*/currentPageNumber/*7.19*/ = {{sessionBean.currentPageNumber}};def /*8.2*/serchedSUMO/*8.13*/ = {{sessionBean.checkedSiteModel.sumo}};def /*10.2*/url/*10.5*/ = {{"https://house-site-scraping.herokuapp.com/page/"}};
Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*6.32*/("""
"""),format.raw/*7.54*/("""
"""),format.raw/*8.52*/("""
"""),format.raw/*9.1*/("""<!--"""),_display_(/*9.6*/{"http://localhost:9000/page/"}),format.raw/*9.37*/("""-->
"""),format.raw/*10.60*/("""
	
"""),_display_(/*12.2*/main("世田谷House")/*12.18*/{_display_(Seq[Any](format.raw/*12.19*/("""
	"""),_display_(/*13.3*/header),format.raw/*13.9*/("""
	"""),format.raw/*14.2*/("""<div class="content">
		"""),_display_(/*15.4*/form),format.raw/*15.8*/("""
		"""),_display_(/*16.4*/if(status == "searched")/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
			"""),_display_(/*17.5*/list),format.raw/*17.9*/("""
			"""),_display_(/*18.5*/page),format.raw/*18.9*/("""
		""")))}/*19.4*/else/*19.8*/{_display_(Seq[Any](format.raw/*19.9*/("""
			"""),_display_(/*20.5*/erorr),format.raw/*20.10*/("""
		""")))}),format.raw/*21.4*/("""
	"""),format.raw/*22.2*/("""</div>
""")))}),format.raw/*23.2*/("""

"""),format.raw/*29.2*/("""

"""),format.raw/*73.2*/("""

"""),format.raw/*98.2*/("""

"""),format.raw/*136.2*/("""

"""),format.raw/*177.2*/("""

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
                  DATE: Thu Aug 24 21:27:22 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: 556fdf9fea2dfdf227e49bf1502a077e0e0808be
                  MATRIX: 575->18|680->469|694->475|775->479|804->481|877->534|889->538|970->542|1002->547|2516->2041|2528->2045|2609->2049|2638->2051|2809->2196|2833->2211|2872->2212|2906->2219|3040->2336|3053->2341|3092->2342|3126->2349|3264->2457|3296->2462|3467->2612|3480->2616|3562->2620|3592->2622|3658->2661|3700->2686|3740->2687|3771->2690|3836->2727|3875->2744|3958->2799|3991->2810|4068->2859|4102->2871|4201->2942|4233->2952|4439->3131|4487->3169|4527->3170|4561->3177|4598->3192|4623->3199|4637->3204|4677->3205|4711->3212|4748->3227|4778->3228|4809->3231|4846->3246|4883->3252|5023->3364|5059->3378|5195->3486|5231->3500|5381->3623|5429->3661|5469->3662|5503->3669|5540->3684|5565->3691|5579->3696|5619->3697|5653->3704|5690->3719|5720->3720|5751->3723|5788->3738|5825->3744|5858->3749|6033->3896|6072->3913|6121->3931|6151->3933|6183->3944|6196->3948|6278->3952|6308->3954|6461->4080|6497->4106|6537->4107|6579->4120|6660->4182|6674->4187|6714->4188|6751->4197|6807->4225|6834->4231|6877->4252|6941->4285|6980->4295|7123->4411|7185->4463|7225->4464|7257->4468|7335->4518|7362->4523|7460->4593|7487->4598|7585->4668|7612->4673|7710->4743|7737->4748|7835->4818|7862->4823|7901->4844|7915->4849|7955->4850|7990->4857|8068->4907|8095->4913|8138->4934|8169->4937|8215->4960|8309->5026|8336->5032|8379->5053|8410->5056|8456->5079|8550->5145|8577->5151|8618->5170|8649->5173|8689->5190|8783->5256|8810->5262|8853->5283|8884->5286|8930->5309|9024->5375|9051->5381|9094->5402|9125->5405|9171->5428|9218->5444|9258->5456|9316->5487|9352->5513|9392->5514|9434->5527|9511->5585|9525->5590|9565->5591|9602->5600|9658->5628|9685->5634|9728->5655|9788->5684|9827->5694|9975->5821|9989->5826|10071->5830|10101->5832|10164->5868|10212->5906|10252->5907|10284->5911|10366->5975|10380->5980|10420->5981|10452->5986|10501->6025|10542->6027|10575->6032|10662->6088|10697->6092|10728->6095|10760->47|10779->58|10821->89|10834->95|10871->121|10896->138|10944->175|10963->186|11016->267|11027->270|11112->44|11141->87|11169->119|11197->173|11225->225|11252->226|11282->231|11333->262|11365->325|11395->329|11420->345|11459->346|11488->349|11514->355|11543->357|11594->382|11618->386|11648->390|11681->414|11720->415|11751->420|11775->424|11806->429|11830->433|11852->437|11864->441|11902->442|11933->447|11959->452|11993->456|12022->458|12060->466|12089->531|12118->2038|12147->2609|12177->3941|12207->5818
                  LINES: 23->3|27->25|27->25|29->25|30->26|33->31|33->31|35->31|36->32|77->75|77->75|79->75|80->76|86->82|86->82|86->82|87->83|90->86|90->86|90->86|91->87|94->90|95->91|102->100|102->100|104->100|105->101|107->103|107->103|107->103|108->104|109->105|109->105|110->106|110->106|111->107|111->107|112->108|112->108|116->112|116->112|116->112|117->113|117->113|118->114|118->114|118->114|119->115|119->115|119->115|119->115|119->115|120->116|123->119|123->119|125->121|125->121|128->124|128->124|128->124|129->125|129->125|130->126|130->126|130->126|131->127|131->127|131->127|131->127|131->127|132->128|133->129|136->132|136->132|138->134|139->135|140->138|140->138|142->138|143->139|146->142|146->142|146->142|147->143|148->144|148->144|148->144|149->145|149->145|149->145|149->145|150->146|151->147|155->151|155->151|155->151|156->152|156->152|156->152|157->153|157->153|158->154|158->154|159->155|159->155|160->156|160->156|161->157|161->157|161->157|162->158|162->158|162->158|162->158|162->158|162->158|163->159|163->159|163->159|163->159|163->159|164->160|164->160|164->160|164->160|164->160|165->161|165->161|165->161|165->161|165->161|166->162|166->162|166->162|166->162|166->162|167->163|169->165|170->166|170->166|170->166|171->167|172->168|172->168|172->168|173->169|173->169|173->169|173->169|174->170|175->171|181->179|181->179|183->179|184->180|185->181|185->181|185->181|186->182|188->184|188->184|188->184|189->185|189->185|189->185|190->186|192->188|193->189|194->190|196->5|196->5|196->6|196->6|196->7|196->7|196->8|196->8|196->10|196->10|197->3|199->5|200->6|201->7|202->8|203->9|203->9|203->9|204->10|206->12|206->12|206->12|207->13|207->13|208->14|209->15|209->15|210->16|210->16|210->16|211->17|211->17|212->18|212->18|213->19|213->19|213->19|214->20|214->20|215->21|216->22|217->23|219->29|221->73|223->98|225->136|227->177
                  -- GENERATED --
              */
          