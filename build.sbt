name := """play-getting-started"""

version := "1.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  jdbc,
  caffeine,
  ws,
  guice,
  "org.postgresql" % "postgresql" % "42.3.6"
)
