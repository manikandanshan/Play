// @SOURCE:/opt/play-2.2.6/myapp/conf/routes
// @HASH:6efb73a8ff9cd146b8522d34a8d573e04c305670
// @DATE:Mon Mar 27 16:02:46 IST 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def details(ean:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application/" + implicitly[PathBindable[String]].unbind("ean", dynamicString(ean)))
}
                                                

// @LINE:7
def newProduct(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application/new")
}
                                                

// @LINE:9
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "application/")
}
                                                

// @LINE:6
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application")
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def details : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.details",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "application/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean))})
      }
   """
)
                        

// @LINE:7
def newProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "application/new"})
      }
   """
)
                        

// @LINE:9
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "application/"})
      }
   """
)
                        

// @LINE:6
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "application"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def details(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.details(ean), HandlerDef(this, "controllers.Application", "details", Seq(classOf[String]), "GET", """""", _prefix + """application/$ean<[^/]+>""")
)
                      

// @LINE:7
def newProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newProduct(), HandlerDef(this, "controllers.Application", "newProduct", Seq(), "GET", """""", _prefix + """application/new""")
)
                      

// @LINE:9
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq(), "POST", """""", _prefix + """application/""")
)
                      

// @LINE:6
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(), HandlerDef(this, "controllers.Application", "list", Seq(), "GET", """ Home page""", _prefix + """application""")
)
                      
    
}
                          
}
        
    