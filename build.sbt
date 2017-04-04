import com.github.play2war.plugin._

name := "Play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.github.play2war" % "play2-war_2.9.1" % "0.8.2"
)

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
