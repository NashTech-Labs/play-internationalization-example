
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala")(implicit messages: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""
    """),format.raw/*4.5*/("""<section>
        <div class="wrapper">
            """),_display_(/*6.14*/if(messages.messages.lang.language.equals("en"))/*6.62*/ {_display_(Seq[Any](format.raw/*6.64*/("""
                """),format.raw/*7.17*/("""<a class = "button" href=""""),_display_(/*7.44*/routes/*7.50*/.MySupportController.homePageInFrench()),format.raw/*7.89*/("""">fr</a>
            """)))}/*8.15*/else/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
                """),format.raw/*9.17*/("""<a class = "button" href=""""),_display_(/*9.44*/routes/*9.50*/.MySupportController.homePageWithDefaultLang()),format.raw/*9.96*/("""">en</a>
            """)))}),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</div>
    </section>

    <div id="content" class="wrapper doc">
        <article>
            <h1>"""),_display_(/*16.18*/message),format.raw/*16.25*/("""</h1>
            <h2>"""),_display_(/*17.18*/messages/*17.26*/.messages("home.title")),format.raw/*17.49*/("""</h2>
        </article>
    </div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String,messages:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(message,style)(messages)

  def f:((String,String) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => (messages) => apply(message,style)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 14 15:50:38 IST 2017
                  SOURCE: /home/teena/play-internationalization-example/app/views/welcome.scala.html
                  HASH: d9eb89c0cadf9427f10ab90eed1278909fb9a821
                  MATRIX: 755->1|929->80|957->83|1004->122|1054->135|1085->140|1164->193|1220->241|1259->243|1303->260|1356->287|1370->293|1429->332|1469->355|1481->360|1519->361|1563->378|1616->405|1630->411|1696->457|1749->479|1785->488|1913->589|1941->596|1991->619|2008->627|2052->650|2119->687
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|32->7|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|36->11|41->16|41->16|42->17|42->17|42->17|45->20
                  -- GENERATED --
              */
          