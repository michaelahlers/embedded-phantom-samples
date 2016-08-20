lazy val EmbeddedPhantomSamples =
  (project in file("."))
    .configs(IntegrationTest)
    .settings(Defaults.itSettings: _*)
