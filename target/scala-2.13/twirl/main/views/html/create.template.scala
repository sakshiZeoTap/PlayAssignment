
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
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import java.util

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Student],Http.Request,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm : Form[Student])(implicit request: Http.Request,messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
    <head>

    </head>
    <body>
        <h1>Add Student</h1>

        """),_display_(/*13.10*/helper/*13.16*/.form(action = helper.CSRF(routes.StudentController.save()))/*13.76*/{_display_(Seq[Any](format.raw/*13.77*/("""

        """),_display_(/*15.10*/helper/*15.16*/.inputText(studentForm("name"))),format.raw/*15.47*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(studentForm("age"))),format.raw/*16.46*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(studentForm("marks"))),format.raw/*17.48*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(studentForm("branch"))),format.raw/*18.49*/("""
        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"> Add Student</button>



        """)))}),format.raw/*23.10*/("""



    """),format.raw/*27.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(studentForm:Form[Student],request:Http.Request,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)(request,messagesProvider)

  def f:((Form[Student]) => (Http.Request,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => (request,messagesProvider) => apply(studentForm)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/create.scala.html
                  HASH: eb2b6b14fae5fb6e69a4028443f9f7593650e91e
                  MATRIX: 610->1|969->19|1138->118|1182->116|1209->134|1236->135|1344->216|1359->222|1428->282|1467->283|1505->294|1520->300|1572->331|1609->341|1624->347|1675->377|1712->387|1727->393|1780->425|1817->435|1832->441|1886->474|1922->483|2033->563|2068->571
                  LINES: 23->1|28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|53->23|57->27
                  -- GENERATED --
              */
          