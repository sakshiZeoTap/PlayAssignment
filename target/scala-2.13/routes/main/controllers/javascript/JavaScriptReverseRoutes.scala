// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:12
  class ReverseStudentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.show",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/details"})
        }
      """
    )
  
    // @LINE:13
    def showById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.showById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/details/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def addStudent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.addStudent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/add"})
        }
      """
    )
  
    // @LINE:15
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudentController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "student/add"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:7
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAPIController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def authorise: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.APIController.authorise",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authorise"})
        }
      """
    )
  
    // @LINE:16
    def display: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.APIController.display",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
  }


}
