import NativePackagerKeys._

packageArchetype.java_application

name := """scala-getting-started"""

version := "1.0"

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-http" % "6.2.0",
  "postgresql" % "postgresql" % "9.0-801.jdbc4"
)
