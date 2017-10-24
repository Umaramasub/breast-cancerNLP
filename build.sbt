import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test,
    // https://mvnrepository.com/artifact/org.apache.tika/tika-parsers
    libraryDependencies += "org.apache.tika" % "tika-parsers" % "1.4",
    // https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml_2.12
    libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6",
    // maven repo

    libraryDependencies += "gov.nih.nlm.nls" % "metamap-api" % "2.0",
    resolvers += Resolver.mavenLocal
    //    // https://mvnrepository.com/artifact/net.liftweb/lift-json_2.9.1
//    libraryDependencies += "net.liftweb" % "lift-json_2.9.1" % "2.6.3"
  )
