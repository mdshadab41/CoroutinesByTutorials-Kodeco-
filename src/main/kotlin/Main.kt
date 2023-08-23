import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
//  val user = getUserStandard("101")
//
//  println(user)
//  getUserFromNetworkCallBack("101"){user ->
//    println(user)
//  }
//  println("Main end")

//  getUserFromNetworkCallBack("101"){user, error->
//    user?.run(::println)
//
//    error?.printStackTrace()
//
//  }
//    GlobalScope.launch {
//        val user = getUserSuspend("101")
//
//        println(user)
//    }
//    Thread.sleep(1500)

    GlobalScope.launch(Dispatchers.Main) {
        val user = getUserSuspend("101")

        println(user)

    }
}

suspend fun getUserSuspend(userId: String): User =
    withContext(Dispatchers.Default){
        delay(1000)

        User(userId, "Filip")
    }

//fun getUserStandard(userId: String): User {
//  Thread.sleep(1000)
//
//  return User(userId, "Filip")
//}

//fun getUserFromNetworkCallBack(
//  userId: String,
//  onUserResponse: (User?, Throwable?) -> Unit){
//  thread {
//
//   try {
//     Thread.sleep(1000)
//     val user = User(userId,"Flip")
//     onUserResponse(user, null)
//   }catch (error: Throwable){
//     onUserResponse(null,error)
//   }
//  }
////  println("End")
//}

//suspend fun getUserSuspend(userId: String): User{
//    delay(1000)
//
//    return User(userId, "Flip")
//}