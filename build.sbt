name := "AtomicScala"

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation")

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.12.4",
  "org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6"
)

