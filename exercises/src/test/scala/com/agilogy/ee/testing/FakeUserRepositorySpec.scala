package com.agilogy.ee.testing

import cats.effect.{ IO, Resource }

final class FakeUserRepositorySpec extends UserRepositorySpec[FakeUserRepository] {

  override val resource: Resource[IO, FakeUserRepository] = ???

  override def setInitialState(repo: FakeUserRepository, values: List[User]): IO[Unit] = ???

  override def getFinalState(repo: FakeUserRepository): IO[List[User]] = ???
}
