// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:12
  class ReverseStudentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def show: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "student/details")
    }
  
    // @LINE:13
    def showById(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "student/details/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:14
    def addStudent(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "student/add")
    }
  
    // @LINE:15
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "student/add")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def tutorial: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:7
    def explore: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:16
  class ReverseAPIController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def authorise(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "authorise")
    }
  
    // @LINE:16
    def display(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
  }


}
