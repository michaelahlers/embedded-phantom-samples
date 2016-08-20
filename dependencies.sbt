val versionScalaTest = "(,2.3["

/**
 * Compile and runtime dependencies.
 */
libraryDependencies ++=
  "ch.qos.logback" % "logback-classic" % "1.1.7" ::
    "consulting.ahlers" % "embedded-phantom" % "0.9.2" ::
    Nil

/**
 * Integration test dependencies.
 */
libraryDependencies ++=
    "org.scalatest" %% "scalatest" % versionScalaTest % IntegrationTest ::
    Nil
