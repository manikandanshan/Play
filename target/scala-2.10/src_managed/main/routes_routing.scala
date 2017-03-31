// @SOURCE:/opt/play-2.2.6/myapp/conf/routes
// @HASH:6efb73a8ff9cd146b8522d34a8d573e04c305670
// @DATE:Mon Mar 27 16:02:46 IST 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_list0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application"))))
        

// @LINE:7
private[this] lazy val controllers_Application_newProduct1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application/new"))))
        

// @LINE:8
private[this] lazy val controllers_Application_details2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application/"),DynamicPart("ean", """[^/]+""",true))))
        

// @LINE:9
private[this] lazy val controllers_Application_save3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application/"))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application""","""controllers.Application.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application/new""","""controllers.Application.newProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application/$ean<[^/]+>""","""controllers.Application.details(ean:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application/""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_list0(params) => {
   call { 
        invokeHandler(controllers.Application.list(), HandlerDef(this, "controllers.Application", "list", Nil,"GET", """ Home page""", Routes.prefix + """application"""))
   }
}
        

// @LINE:7
case controllers_Application_newProduct1(params) => {
   call { 
        invokeHandler(controllers.Application.newProduct(), HandlerDef(this, "controllers.Application", "newProduct", Nil,"GET", """""", Routes.prefix + """application/new"""))
   }
}
        

// @LINE:8
case controllers_Application_details2(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Application.details(ean), HandlerDef(this, "controllers.Application", "details", Seq(classOf[String]),"GET", """""", Routes.prefix + """application/$ean<[^/]+>"""))
   }
}
        

// @LINE:9
case controllers_Application_save3(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """application/"""))
   }
}
        

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     