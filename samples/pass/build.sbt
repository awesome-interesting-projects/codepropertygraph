name := "samplepass"
organization := "io.shiftleft"

val cpgVersion = "0.11.1"

libraryDependencies ++= Seq(

  "io.shiftleft" %% "codepropertygraph" % cpgVersion,
  "io.shiftleft" %% "enhancements"  % cpgVersion,

  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

ThisBuild / resolvers ++= Seq(
  Resolver.mavenLocal,
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/public",
)

enablePlugins(JavaAppPackaging)
