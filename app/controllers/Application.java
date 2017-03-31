package controllers;

/*import play.libs.F.Function;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

  public static Result feedTitle(String feedUrl) {
    return async(
      WS.url(feedUrl).get().map(
        new Function<WS.Response, Result>() {
          public Result apply(WS.Response response) {
            return ok("Feed title:" + response.asJson().findPath("title"));
          }
        }
      )
    );
  }
  
}*/

/*import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.Result;
public class Application extends Controller {
public static Promise<Result> index() {
	
    final Promise<Result> resultPromise = WS.url("http://www.playframework.com").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {
                    return ok("Feed title:");
                	
                }
            }
    );
    return resultPromise;
}
}*/

import play.mvc.Controller;
import play.mvc.Result;
public class Application extends Controller {
public static Result list() {
String name="mani";
return ok("Hello Playworld:" +name);
}
public static Result newProduct() {
return TODO;
}

public static Result details(String ean) {
return TODO;
}
public static Result save() {
return TODO;
}
}
