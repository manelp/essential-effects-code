package com.agilogy.ee.testing

import cats.effect.concurrent.Ref
import cats.effect.{ IO, Resource }

final case class FakeUserRepository(users: Ref[IO, List[User]]) extends UserRepositoryAlg {

  override def createUser(user: User): IO[Unit] = ???

  override def getUserByUsername(username: String): IO[Option[User]] = ???

  override def updateEmail(username: String, email: String): IO[Unit] = ???

  override def deleteUser(username: String): IO[Unit] = ???
}

object FakeUserRepository {

  def resource(): Resource[IO, FakeUserRepository] =
    Resource.eval(Ref[IO].of(List.empty[User])).map(FakeUserRepository(_))
}
