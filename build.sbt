name := "Countdown"
scalaVersion := "2.11.8"

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.27")
libraryDependencies += "com.softwaremill.sttp.client" %% "core" % "2.0.0-RC6"
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.9.4"