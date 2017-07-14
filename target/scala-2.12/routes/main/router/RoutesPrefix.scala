
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teena/projects/play-internationalization-example/conf/routes
// @DATE:Tue Jul 04 11:47:49 IST 2017


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
