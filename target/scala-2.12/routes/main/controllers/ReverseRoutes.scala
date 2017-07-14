
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teena/play-internationalization-example/conf/routes
// @DATE:Fri Jul 14 15:50:38 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseMySupportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def homePageInFrench(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "englishtofrench")
    }
  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:4
    def homePageWithDefaultLang(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frenchtoenglish")
    }
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
