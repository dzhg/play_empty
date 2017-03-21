import sbt.Keys._

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.codingwell"          %% "scala-guice" % "4.1.0",
  "com.typesafe.play"       %% "play-slick" % "2.1.0",
  "com.typesafe.play"       %% "play-slick-evolutions" % "2.1.0",
  "com.github.tminglei"     %% "slick-pg" % "0.15.0-RC",
  "com.github.tminglei"     %% "slick-pg_play-json" % "0.15.0-RC",
  "org.postgresql"          %  "postgresql" % "42.0.0",
  "org.mockito"             %  "mockito-core" % "2.7.16" % Test,
  "org.scalatestplus.play"  %% "scalatestplus-play" % "2.0.0" % Test
)

// The Play project itself
lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-empty"""
  )
