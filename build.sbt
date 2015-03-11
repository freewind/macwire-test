name := "macwire-test"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "0.8.0",
  "com.softwaremill.macwire" %% "runtime" % "0.8.0"
)
