


lazy val common = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.redbee",
      scalaVersion := "2.13.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "common"
  )

libraryDependencies ++= Seq()

//libraryDependencies ++= Seq(
//  "org.apache.cxf" % "cxf-tools-wsdlto-core" % "3.1.11",
//  "org.apache.cxf" % "cxf-tools-wsdlto-databinding-jaxb" % "3.1.11",
//  "org.apache.cxf" % "cxf-tools-wsdlto-frontend-jaxws" % "3.1.11"
//)

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

