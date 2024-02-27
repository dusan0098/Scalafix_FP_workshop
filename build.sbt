import Dependencies._

resolvers += Resolver.typesafeIvyRepo("releases")

lazy val buildSettings = Seq(
  organization := "io.lambdaworks",
  organizationName := "Lambdaworks",
  name := "Workshop",
  addCompilerPlugin(scalafixSemanticdb),
  scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Ypartial-unification","-Yrangepos","-Ywarn-unused-import")
)
scalaVersion in ThisBuild := "2.12.19"

lazy val libs = Seq(cats, joda, emoji, scalameta, scalaTest)

lazy val root = (project in file("."))
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= libs)
