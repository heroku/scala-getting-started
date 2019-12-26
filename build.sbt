name := """play-getting-started"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.1"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  guice
)
