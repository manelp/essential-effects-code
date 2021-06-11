package com.agilogy.ee.testing

abstract class UserRepositorySpec[T <: UserRepositoryAlg] extends BaseSuite[List[User], T] {

  val user1 = User("johny", "johny@bar.com")
  val user2 = User("panam", "panam@baz.com")
  val user3 = User("v", "v@foo.com")

  val all = List(user1, user2, user3)

  test("create user") {
    check(List.empty[User], List(user1), ()) { repo =>
      repo.createUser(user1)
    }
  }

  test("get user by username") {
    check(all, all, Option(user2)) { repo =>
      repo.getUserByUsername(user2.username)
    }
  }

  test("update email") {
    val newEmail = "new@bar.com"
    val expected = List(user1, user2, user3.copy(email = newEmail))
    check(all, expected, ()) { repo =>
      repo.updateEmail(user3.username, newEmail)
    }
  }

  test("delete user") {
    check(all, all.drop(1), ()) { repo =>
      repo.deleteUser(user1.username)
    }
  }

}
