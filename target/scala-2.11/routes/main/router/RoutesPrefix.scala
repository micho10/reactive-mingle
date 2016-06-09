
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carlos/dev/play-scala-intro/conf/routes
// @DATE:Thu Jun 02 17:58:06 JST 2016


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
