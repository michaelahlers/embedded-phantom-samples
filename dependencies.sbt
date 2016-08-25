resolvers += "Ahlers Consulting" at "http://artifacts.ahlers.consulting"

val versionScalaTest = "(,2.3["

/**
 * Compile and runtime dependencies.
 */
libraryDependencies ++=
  "ch.qos.logback" % "logback-classic" % "1.1.7" ::
    "consulting.ahlers" % "embedded-phantom" % "1.0.0" ::
    ("consulting.ahlers" % "embedded-phantom" % "1.0.0" classifier "it") ::
    Nil

/**
 * Integration test dependencies.
 */
libraryDependencies ++=
  "org.scalatest" %% "scalatest" % versionScalaTest % IntegrationTest ::
    Nil
