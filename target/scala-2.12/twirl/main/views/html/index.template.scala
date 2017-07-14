
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit messages: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
    """),_display_(/*3.6*/welcome(message, style = "scala")),format.raw/*3.39*/("""
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(message:String,messages:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(message)(messages)

  def f:((String) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (message) => (messages) => apply(message)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 04 11:39:26 IST 2017
                  SOURCE: /home/teena/projects/play-internationalization-example/app/views/index.scala.html
                  HASH: 0cb804f707a33de88baec398bc9bf15e13562e4f
                  MATRIX: 746->1|895->55|922->57|953->80|992->82|1023->88|1076->121|1107->123
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|29->4
                  -- GENERATED --
              */
          