
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messages: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*4.14*/messages/*4.22*/.messages.lang.language),format.raw/*4.45*/("""">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*14.32*/("""
        """),_display_(/*15.10*/content),format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages)

  def f:((String) => (Html) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages) => apply(title)(content)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 04 11:39:26 IST 2017
                  SOURCE: /home/teena/projects/play-internationalization-example/app/views/main.scala.html
                  HASH: 56bb223b10471b2725da5cc9847464bd25813aa8
                  MATRIX: 750->1|912->68|940->70|995->99|1011->107|1054->130|1103->205|1138->214|1172->222|1197->227|1285->289|1299->295|1361->336|1448->397|1462->403|1522->442|1574->467|1589->473|1651->514|1745->670|1782->680|1810->687|1842->692
                  LINES: 21->1|26->1|28->3|29->4|29->4|29->4|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|38->14|39->15|39->15|40->16
                  -- GENERATED --
              */
          