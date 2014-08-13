import NativePackagerKeys._

packageArchetype.java_application

name := """scala-getting-started"""

version := "1.0"

//scalaVersion := "2.11.1"

//resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies += "com.twitter" %% "finagle-http" % "6.2.0"
