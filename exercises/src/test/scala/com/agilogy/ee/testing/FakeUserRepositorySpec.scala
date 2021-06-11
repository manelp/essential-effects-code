package com.agilogy.ee.testing

import cats.effect.{ IO, Resource }

final class FakeUserRepositorySpec extends UserRepositorySpec[FakeUserRepository] {

  override val resource: Resource[IO, FakeUserRepository] = FakeUserRepository.resource()

  override def setInitialState(repo: FakeUserRepository, values: List[User]): IO[Unit] = repo.users.set(values)

  override def getFinalState(repo: FakeUserRepository): IO[List[User]] = repo.users.get.map(_.sortBy(_.username))
}
