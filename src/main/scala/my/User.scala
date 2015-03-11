package my

class GroupService {
  def h() = "Hello"
}

class TTT {}

class UserService {
  def w() = "world"
}

class III {}

class User(groupService: GroupService)(userService: UserService) {
  def hello = groupService.h() + userService.w()
}


trait Module {
  import com.softwaremill.macwire.MacwireMacros._

  val groupService = wire[GroupService]
  val userService = wire[UserService]
  val user = wire[User]
}

object Main extends App with Module {
  println(user.hello)
}
