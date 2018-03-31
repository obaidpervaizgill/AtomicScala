name := "AtomicScala"

version := "1.0"

scalaVersion := "2.12.5"

scalacOptions ++= Seq("-deprecation")

resolvers ++= Seq(
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  "Sbt plugins" at "https:/dl.bintray.com/sbt/sbt-plugin-releases"
)
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.12.5",
  "org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6"
)

