package controllers

import javax.inject._
import play.api._
import play.api.cache._
import play.api.db._
import play.api.mvc._

@Singleton
class Application @Inject() (
    database: Database,
    cache: AsyncCacheApi,
    val controllerComponents: ControllerComponents
) extends BaseController {

  def index = Action {
    Ok(views.html.index(null))
  }

  def db = Action {
    var out = ""
    val conn = database.getConnection()
    try {
      val stmt = conn.createStatement

      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)")
      stmt.executeUpdate("INSERT INTO ticks VALUES (now())")

      val rs = stmt.executeQuery("SELECT tick FROM ticks")

      while (rs.next) {
        out += "Read from DB: " + rs.getTimestamp("tick") + "\n"
      }
    } finally {
      conn.close()
    }
    Ok(out)
  }
}
