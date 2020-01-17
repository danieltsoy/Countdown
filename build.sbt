import scalapb.compiler.Version.scalapbVersion

scalaVersion := "2.12.10"
sbtVersion := "1.3.7"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

libraryDependencies ++= Seq(
  // For finding google/protobuf/descriptor.proto
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
  "com.softwaremill.sttp.client" %% "core" % "2.0.0-RC6",
  "com.google.transit" % "gtfs-realtime-bindings" % "0.0.2"
)
