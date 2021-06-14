package com.agilogy.ee.testing

import cats.effect.IO

final case class User(username: String, email: String)

trait UserRepositoryAlg {

  def createUser(user: User): IO[Unit]

  def getUserByUsername(username: String): IO[Option[User]]

  def updateEmail(username: String, email: String): IO[Unit]

  def deleteUser(username: String): IO[Unit]

}
