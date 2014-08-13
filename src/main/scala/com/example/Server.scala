package com.example

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import com.twitter.finagle.http.Response
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http._
import util.Properties

object Server {
  def main(args: Array[String]) {
    val port = Properties.envOrElse("PORT", "8080").toInt
    println("Starting on port: "+port)
    
    val service = new Service[HttpRequest, HttpResponse] {
      def apply(req: HttpRequest): Future[HttpResponse] = {
        val response = Response()
        response.setStatusCode(200)
        response.setContentString("Hello from Scala!")
    
        Future(response)
      }
    }
    
    val server = Http.serve(":" + port, service)
    Await.ready(server)
  }
}
