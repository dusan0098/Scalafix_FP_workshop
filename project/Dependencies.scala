import sbt._

object Dependencies {

  object Versions {
    val Cats = "2.1.1"
    val Joda = "2.10.5"

    val Emoji = "1.2.1"

    val ScalaTest = "3.1.1"
  }

  val cats: ModuleID = "org.typelevel" %% "cats-core" % Versions.Cats
  val joda: ModuleID = "joda-time"     % "joda-time"  % Versions.Joda

  val scalameta: ModuleID = "org.scalameta" %% "scalameta" % "4.3.14"

  val emoji: ModuleID = "com.lightbend" %% "emoji" % Versions.Emoji

  val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % Versions.ScalaTest % "test"

}
