import sbt._

object LiftModuleKeys {

  lazy val liftVersion = SettingKey[String]("version number of the Lift Web Framework")

  lazy val liftEdition = SettingKey[String]("lift Edition (short version number to append to artifact name)")

}
