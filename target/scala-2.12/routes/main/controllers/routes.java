
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teena/projects/play-internationalization-example/conf/routes
// @DATE:Tue Jul 04 11:47:49 IST 2017

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
