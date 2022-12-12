// See README.md for license details.

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "eu.fabienm"

lazy val root = (project in file("."))
  .settings(
    name := "GbHdmi",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.5.4",
      "edu.berkeley.cs" %% "chiseltest" % "0.5.4" % "test",
      "eu.fabienm" %% "gbvga" % "0.1.0",
      "com.armadeus" %% "hdmicore" % "0.1.0",
      "Martoni" %% "chisnespad" % "0.2.0",
      "Martoni" %% "fpgamacro" % "0.2.1-SNAPSHOT"
    ),
    scalacOptions ++= Seq(
      "-Xsource:2.11",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      // Enables autoclonetype2 in 3.4.x (on by default in 3.5)
      "-P:chiselplugin:useBundlePlugin"
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.4" cross CrossVersion.full)
  )

