
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
			<div class="checkboxs">
				<div class="checkboxs-title">サイト選択</div>
				<label>
					<input type="checkbox" class="checkbox" name="sumo" value=1 />
					<span class="checkbox-icon"></span>
					SUMO
					<!-- <input type="checkbox" class="checkbox" name="sumo" value=1 />
					<span class="checkbox-icon"></span>
					homes -->
				</label>
				<div class="scripbtn">
					<button type="submit" class="btn btn-success">スクレイピングスタート！</button>
				</div>
			</div>
		</form>
	</div>
""")))};def /*87.2*/list/*87.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*87.10*/("""
	"""),format.raw/*88.2*/("""<div class="property_unit-content">

	"""),_display_(/*90.3*/for( map <- viewListMap ) yield /*90.28*/{_display_(Seq[Any](format.raw/*90.29*/("""
		"""),format.raw/*91.3*/("""<div class="container">
			<a href=""""),_display_(/*92.14*/map("detail_url")),format.raw/*92.31*/("""" target="_blank">
				<div class="col-md-1 col-xs-1">"""),_display_(/*93.37*/map("site")),format.raw/*93.48*/("""</div>
				<div class="col-md-11 col-xs-11"><h4>"""),_display_(/*94.43*/map("title")),format.raw/*94.55*/("""</h4></div>
				<div class="col-md-4 col-xs-12 mobile-img" ><img src=""""),_display_(/*95.60*/map("img")),format.raw/*95.70*/("""" rel="" alt="" width="192" height="144"></div>
			</a>
			<div class="col-md-2 col-xs-6 item item-left item-top">販売価格</div>
			<div class="col-md-6 col-xs-6 item item-top">
				"""),_display_(/*99.6*/if(map("minPrice") == map("maxPrice"))/*99.44*/{_display_(Seq[Any](format.raw/*99.45*/("""
					"""),_display_(/*100.7*/map("minPrice")),format.raw/*100.22*/("""
				""")))}/*101.7*/else/*101.12*/{_display_(Seq[Any](format.raw/*101.13*/("""
					"""),_display_(/*102.7*/map("minPrice")),format.raw/*102.22*/(""" """),format.raw/*102.23*/("""~ """),_display_(/*102.26*/map("maxPrice")),format.raw/*102.41*/("""
				""")))}),format.raw/*103.6*/("""万円
			</div>
			<div class="col-md-2 col-xs-6 item item-left">所在地</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*106.41*/map("address")),format.raw/*106.55*/("""</div>	
			<div class="col-md-2 col-xs-6 item item-left">沿線・駅</div>
			<div class="col-md-6 col-xs-6 item">"""),_display_(/*108.41*/map("station")),format.raw/*108.55*/("""</div>											
			<div class="col-md-2 col-xs-6 item item-left">土地面積</div>
			<div class="col-md-6 col-xs-6 item">
				"""),_display_(/*111.6*/if(map("minSpace") == map("maxSpace"))/*111.44*/{_display_(Seq[Any](format.raw/*111.45*/("""
					"""),_display_(/*112.7*/map("minSpace")),format.raw/*112.22*/("""
				""")))}/*113.7*/else/*113.12*/{_display_(Seq[Any](format.raw/*113.13*/("""
					"""),_display_(/*114.7*/map("minSpace")),format.raw/*114.22*/(""" """),format.raw/*114.23*/("""~ """),_display_(/*114.26*/map("maxSpace")),format.raw/*114.41*/("""
				""")))}),format.raw/*115.6*/("""
				"""),format.raw/*116.5*/("""m<sup>2</sup>
			</div>
			<div class="col-md-2 col-xs-6 item item-bottom item-left">間取り</div>
			<div class="col-md-2 col-xs-6 item item-bottom">"""),_display_(/*119.53*/map("roomLayout")),format.raw/*119.70*/("""</div>
		</div>
	""")))}),format.raw/*121.3*/("""
	"""),format.raw/*122.2*/("""</div>
""")))};def /*125.2*/page/*125.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*125.10*/("""
	"""),format.raw/*126.2*/("""<nav class="pagecontent" aria-label="Page navigation example">
	  <ul class="pagination">
	    <li class="page-item">
	      """),_display_(/*129.9*/if(pageNo == 1)/*129.24*/{_display_(Seq[Any](format.raw/*129.25*/("""
            """),format.raw/*130.13*/("""<a class="page-link" href="#" aria-label="Previous">
	      """)))}/*131.10*/else/*131.15*/{_display_(Seq[Any](format.raw/*131.16*/("""
	      	"""),format.raw/*132.9*/("""<a class="page-link" href=""""),_display_(/*132.37*/{url}),_display_(/*132.43*/{pageNo-1}),format.raw/*132.53*/("""" aria-label="Previous">
	      """)))}),format.raw/*133.9*/("""
	        """),format.raw/*134.10*/("""<span aria-hidden="true">&laquo;</span>
	        <span class="sr-only">Previous</span>
	      </a>
	    </li>
	    """),_display_(/*138.7*/if(pageNo == 1 || pageNo == 2)/*138.37*/{_display_(Seq[Any](format.raw/*138.38*/("""
			"""),format.raw/*139.4*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*139.54*/{url}),format.raw/*139.59*/("""1">1</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*140.57*/{url}),format.raw/*140.62*/("""2">2</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*141.57*/{url}),format.raw/*141.62*/("""3">3</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*142.57*/{url}),format.raw/*142.62*/("""4">4</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*143.57*/{url}),format.raw/*143.62*/("""5">5</a></li>
	    """)))}/*144.8*/else/*144.13*/{_display_(Seq[Any](format.raw/*144.14*/("""
	    	"""),format.raw/*145.7*/("""<li class="page-item"><a class="page-link" href=""""),_display_(/*145.57*/{url}),_display_(/*145.63*/{pageNo-2}),format.raw/*145.73*/("""">"""),_display_(/*145.76*/{pageNo - 2}),format.raw/*145.88*/("""</a></li>	    
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*146.57*/{url}),_display_(/*146.63*/{pageNo-1}),format.raw/*146.73*/("""">"""),_display_(/*146.76*/{pageNo - 1}),format.raw/*146.88*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*147.57*/{url}),_display_(/*147.63*/{pageNo}),format.raw/*147.71*/("""">"""),_display_(/*147.74*/pageNo),format.raw/*147.80*/("""</a></li>
		    <li class="page-item"><a class="page-link" href=""""),_display_(/*148.57*/{url}),_display_(/*148.63*/{pageNo+1}),format.raw/*148.73*/("""">"""),_display_(/*148.76*/{pageNo + 1}),format.raw/*148.88*/("""</a></li>
	    	<li class="page-item"><a class="page-link" href=""""),_display_(/*149.57*/{url}),_display_(/*149.63*/{pageNo+2}),format.raw/*149.73*/("""">"""),_display_(/*149.76*/{pageNo + 2}),format.raw/*149.88*/("""</a></li>		    
	    """)))}),format.raw/*150.7*/("""
	    
	    """),format.raw/*152.6*/("""<li class="page-item">
	      """),_display_(/*153.9*/if(pageNo == 1)/*153.24*/{_display_(Seq[Any](format.raw/*153.25*/("""
            """),format.raw/*154.13*/("""<a class="page-link" href="#" aria-label="Next">
	      """)))}/*155.10*/else/*155.15*/{_display_(Seq[Any](format.raw/*155.16*/("""
	      	"""),format.raw/*156.9*/("""<a class="page-link" href=""""),_display_(/*156.37*/{url}),_display_(/*156.43*/{pageNo+1}),format.raw/*156.53*/("""" aria-label="Next">
	      """)))}),format.raw/*157.9*/("""
	        """),format.raw/*158.10*/("""<span aria-hidden="true">&raquo;</span>
	        <span class="sr-only">Next</span>
	      </a>
	    </li>
	  </ul>
	</nav>
""")))};def /*166.2*/erorr/*166.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*166.11*/("""
	"""),format.raw/*167.2*/("""<div style="text-align: center">
		"""),_display_(/*168.4*/if(status == "SocketTimeoutException")/*168.42*/{_display_(Seq[Any](format.raw/*168.43*/("""
			"""),format.raw/*169.4*/("""<h2>サイトのスクレイピング中にエラーが発生しました。</h2>
			<h2>画面の更新をお願いします。</h2>
		""")))}/*171.5*/else/*171.10*/{_display_(Seq[Any](format.raw/*171.11*/("""
			"""),_display_(/*172.5*/if(status != null && status != "first")/*172.44*/ {_display_(Seq[Any](format.raw/*172.46*/("""
				"""),format.raw/*173.5*/("""<h2>予期せぬエラーが発生しました。</h2>
				<h2>画面の更新をお願いします。</h2>
			""")))}),format.raw/*175.5*/("""
		""")))}),format.raw/*176.4*/("""	
	"""),format.raw/*177.2*/("""</div>
	
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

"""),format.raw/*85.2*/("""

"""),format.raw/*123.2*/("""

"""),format.raw/*164.2*/("""

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
                  DATE: Thu Aug 17 01:58:34 JST 2017
                  SOURCE: /Users/nishida-takuro/heroku/webScrap/app/views/index.scala.html
                  HASH: d4d19c2a41403d54309bbb027b66e3ac2fa8a25d
                  MATRIX: 583->1|770->296|784->302|865->306|894->308|967->361|979->365|1060->369|1092->374|2606->1868|2618->1872|2699->1876|2728->1878|3278->2408|3290->2412|3371->2416|3400->2418|3465->2457|3506->2482|3545->2483|3575->2486|3639->2523|3677->2540|3759->2595|3791->2606|3867->2655|3900->2667|3998->2738|4029->2748|4234->2927|4281->2965|4320->2966|4354->2973|4391->2988|4416->2995|4430->3000|4470->3001|4504->3008|4541->3023|4571->3024|4602->3027|4639->3042|4676->3048|4816->3160|4852->3174|4988->3282|5024->3296|5174->3419|5222->3457|5262->3458|5296->3465|5333->3480|5358->3487|5372->3492|5412->3493|5446->3500|5483->3515|5513->3516|5544->3519|5581->3534|5618->3540|5651->3545|5826->3692|5865->3709|5914->3727|5944->3729|5976->3740|5989->3744|6071->3748|6101->3750|6254->3876|6279->3891|6319->3892|6361->3905|6442->3967|6456->3972|6496->3973|6533->3982|6589->4010|6616->4016|6648->4026|6712->4059|6751->4069|6894->4185|6934->4215|6974->4216|7006->4220|7084->4270|7111->4275|7209->4345|7236->4350|7334->4420|7361->4425|7459->4495|7486->4500|7584->4570|7611->4575|7650->4596|7664->4601|7704->4602|7739->4609|7817->4659|7844->4665|7876->4675|7907->4678|7941->4690|8040->4761|8067->4767|8099->4777|8130->4780|8164->4792|8258->4858|8285->4864|8315->4872|8346->4875|8374->4881|8468->4947|8495->4953|8527->4963|8558->4966|8592->4978|8686->5044|8713->5050|8745->5060|8776->5063|8810->5075|8863->5097|8903->5109|8961->5140|8986->5155|9026->5156|9068->5169|9145->5227|9159->5232|9199->5233|9236->5242|9292->5270|9319->5276|9351->5286|9411->5315|9450->5325|9598->5452|9612->5457|9694->5461|9724->5463|9787->5499|9835->5537|9875->5538|9907->5542|9989->5606|10003->5611|10043->5612|10075->5617|10124->5656|10165->5658|10198->5663|10285->5719|10320->5723|10351->5726|10383->111|10393->114|10479->109|10507->169|10535->172|10559->188|10597->189|10625->192|10650->198|10678->200|10728->225|10751->229|10780->233|10806->251|10844->252|10874->257|10897->261|10928->266|10952->270|10986->274|11016->278|11041->283|11070->285|11108->293|11137->358|11166->1865|11195->2405|11225->3737|11255->5449
                  LINES: 20->1|24->16|24->16|26->16|27->17|30->22|30->22|32->22|33->23|74->66|74->66|76->66|77->67|95->87|95->87|97->87|98->88|100->90|100->90|100->90|101->91|102->92|102->92|103->93|103->93|104->94|104->94|105->95|105->95|109->99|109->99|109->99|110->100|110->100|111->101|111->101|111->101|112->102|112->102|112->102|112->102|112->102|113->103|116->106|116->106|118->108|118->108|121->111|121->111|121->111|122->112|122->112|123->113|123->113|123->113|124->114|124->114|124->114|124->114|124->114|125->115|126->116|129->119|129->119|131->121|132->122|133->125|133->125|135->125|136->126|139->129|139->129|139->129|140->130|141->131|141->131|141->131|142->132|142->132|142->132|142->132|143->133|144->134|148->138|148->138|148->138|149->139|149->139|149->139|150->140|150->140|151->141|151->141|152->142|152->142|153->143|153->143|154->144|154->144|154->144|155->145|155->145|155->145|155->145|155->145|155->145|156->146|156->146|156->146|156->146|156->146|157->147|157->147|157->147|157->147|157->147|158->148|158->148|158->148|158->148|158->148|159->149|159->149|159->149|159->149|159->149|160->150|162->152|163->153|163->153|163->153|164->154|165->155|165->155|165->155|166->156|166->156|166->156|166->156|167->157|168->158|174->166|174->166|176->166|177->167|178->168|178->168|178->168|179->169|181->171|181->171|181->171|182->172|182->172|182->172|183->173|185->175|186->176|187->177|189->2|189->2|190->1|191->2|193->4|193->4|193->4|194->5|194->5|195->6|196->7|196->7|197->8|197->8|197->8|198->9|198->9|199->10|199->10|200->11|201->12|201->12|202->13|203->14|205->20|207->64|209->85|211->123|213->164
                  -- GENERATED --
              */
          