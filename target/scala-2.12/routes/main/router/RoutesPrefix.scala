
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teena/play-internationalization-example/conf/routes
// @DATE:Fri Jul 14 15:50:38 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
