name := """play-getting-started"""

version := "1.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.4.200",
  caffeine,
  guice,
  jdbc,
  ws,
)
