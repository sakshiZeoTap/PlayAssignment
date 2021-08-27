name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)
scalaVersion := "2.13.5"
libraryDependencies += guice
libraryDependencies += javaJdbc
resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "com.github.thibaultmeyer" % "play-rabbitmq-module" % "release~20.08"
libraryDependencies +="com.rabbitmq" % "amqp-client" % "2.8.1"
libraryDependencies ++= Seq(
  ws,
  filters,
  evolutions,
  javaJdbc,
  "org.postgresql" % "postgresql" % "42.1.1"
)






