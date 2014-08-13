import NativePackagerKeys._

packageArchetype.java_application

name := """scala-getting-started"""

version := "1.0"

libraryDependencies += "com.twitter" %% "finagle-http" % "6.2.0"
