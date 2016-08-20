organization := "consulting.ahlers"

name := "embedded-phantom-samples"

description := "External verification of Embedded Phantom."

homepage := Some(url("http://github.com/michaelahlers/embedded-phantom-samples"))

startYear := Some(2016)

developers :=
  Developer("michaelahlers", "Michael Ahlers", "michael@ahlers.consulting", url("http://github.com/michaelahlers")) ::
    Nil

scmInfo :=
  Some(ScmInfo(
    browseUrl = url("http://github.com/michaelahlers/embedded-phantom-samples"),
    connection = "scm:git:https://github.com:michaelahlers/embedded-phantom-samples.git",
    devConnection = Some("scm:git:git@github.com:michaelahlers/embedded-phantom-samples.git")
  ))

licenses :=
  "MIT" -> url("http://opensource.org/licenses/MIT") ::
    Nil
