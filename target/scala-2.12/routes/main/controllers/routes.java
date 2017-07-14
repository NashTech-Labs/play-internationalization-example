
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teena/play-internationalization-example/conf/routes
// @DATE:Fri Jul 14 15:50:38 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMySupportController MySupportController = new controllers.ReverseMySupportController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMySupportController MySupportController = new controllers.javascript.ReverseMySupportController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
