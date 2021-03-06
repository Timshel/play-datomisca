import sbt._

object Dependencies {

  object V {
    // compile
    val datomic      = "0.9.4766.16"
    val datomisca    = "0.7-alpha-11"
    val play23       = "2.3.1"
    val play22       = "2.2.3"

    // test
    val specs2    = "2.3.12"
  }

  object Compile {
    val datomic      = "com.datomic"       %  "datomic-free"    % V.datomic    % "provided" exclude("org.slf4j", "slf4j-nop") exclude("org.jboss.netty", "netty")
    val datomisca    = "com.pellucid"      %% "datomisca"       % V.datomisca
    val play23       = "com.typesafe.play" %% "play"            % V.play23
    val play22       = "com.typesafe.play" %% "play"            % V.play22
  }

  object Test {
    val playTest23  = "com.typesafe.play"  %% "play-test"    % V.play23      % "test"
    val playTest22  = "com.typesafe.play"  %% "play-test"    % V.play22      % "test"
    val specs2      = "org.specs2"         %% "specs2"       % V.specs2    % "test"
  }
}
