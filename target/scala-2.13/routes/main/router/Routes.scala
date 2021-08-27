// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:12
  StudentController_0: controllers.StudentController,
  // @LINE:16
  APIController_2: controllers.APIController,
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:12
    StudentController_0: controllers.StudentController,
    // @LINE:16
    APIController_2: controllers.APIController,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, StudentController_0, APIController_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, StudentController_0, APIController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/details""", """controllers.StudentController.show"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/details/""" + "$" + """id<[^/]+>""", """controllers.StudentController.showById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/add""", """controllers.StudentController.addStudent(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/add""", """controllers.StudentController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.APIController.display(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authorise""", """controllers.APIController.authorise(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_3.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_3.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_StudentController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/details")))
  )
  private[this] lazy val controllers_StudentController_show3_invoker = createInvoker(
    StudentController_0.show,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "show",
      Nil,
      "GET",
      this.prefix + """student/details""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_StudentController_showById4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/details/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_showById4_invoker = createInvoker(
    StudentController_0.showById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "showById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """student/details/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_StudentController_addStudent5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/add")))
  )
  private[this] lazy val controllers_StudentController_addStudent5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentController_0.addStudent(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "addStudent",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """student/add""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_StudentController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/add")))
  )
  private[this] lazy val controllers_StudentController_save6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      StudentController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudentController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """student/add""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_APIController_display7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_APIController_display7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      APIController_2.display(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.APIController",
      "display",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_APIController_authorise8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authorise")))
  )
  private[this] lazy val controllers_APIController_authorise8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      APIController_2.authorise(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.APIController",
      "authorise",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """authorise""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:7
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_3.explore)
      }
  
    // @LINE:8
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_3.tutorial)
      }
  
    // @LINE:12
    case controllers_StudentController_show3_route(params@_) =>
      call { 
        controllers_StudentController_show3_invoker.call(StudentController_0.show)
      }
  
    // @LINE:13
    case controllers_StudentController_showById4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_StudentController_showById4_invoker.call(StudentController_0.showById(id))
      }
  
    // @LINE:14
    case controllers_StudentController_addStudent5_route(params@_) =>
      call { 
        controllers_StudentController_addStudent5_invoker.call(
          req => StudentController_0.addStudent(req))
      }
  
    // @LINE:15
    case controllers_StudentController_save6_route(params@_) =>
      call { 
        controllers_StudentController_save6_invoker.call(
          req => StudentController_0.save(req))
      }
  
    // @LINE:16
    case controllers_APIController_display7_route(params@_) =>
      call { 
        controllers_APIController_display7_invoker.call(
          req => APIController_2.display(req))
      }
  
    // @LINE:17
    case controllers_APIController_authorise8_route(params@_) =>
      call { 
        controllers_APIController_authorise8_invoker.call(
          req => APIController_2.authorise(req))
      }
  
    // @LINE:20
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
