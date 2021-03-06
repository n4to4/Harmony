organization := "me.jeffshaw.harmony"

name := "harmony_cats0.9.0_scalaz7.2"

version := "1.0"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.11.8", "2.10.6")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.9.0",
  "org.scalaz" %% "scalaz-core" % "7.2.8",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test
)

//better type syntax from https://github.com/non/kind-projector
addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.3" cross CrossVersion.binary)

libraryDependencies ++= (scalaBinaryVersion.value match {
  case "2.10" =>
    compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full) :: Nil
  case _ =>
    Nil
})

scalacOptions := Seq("-Xlog-implicits")

pomExtra in ThisBuild :=
  <url>https://github.com/shawjef3/Harmony</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
      <comments>A business-friendly OSS license</comments>
    </license>
  </licenses>
  <developers>
    <developer>
      <name>Jeff Shaw</name>
      <id>shawjef3</id>
      <url>https://github.com/shawjef3/</url>
    </developer>
  </developers>
  <scm>
    <url>git@github.com:rocketfuel/Harmony.git</url>
    <connection>scm:git:git@github.com:rocketfuel/Harmony.git</connection>
  </scm>
