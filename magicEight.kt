import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    //Define the array for response
    val respones = arrayOf(
        "Yes, of course!",
        "For sure!",
        "Not an option!",
        "I don't think so.",
        "Better not to tell you now.",
        "You can count on it!",
        "My sources say no.",
        "It is certain",
        "Signs point to yes",
        "Perhaps"
    )

    //main loop
    println("Welcome to the Magic 8 Ball!")
    var playAgain = true

    while (playAgain) {
        print("Ask a yes or no question (or type 'q' to quit): ")
        val question = readln().lowercase()

        if (question == "q") {
            println("Okay! See you next time!")
            playAgain = false
        } else {
            val randomIndex = Random.nextInt(respones.size)
            println("Magic 8 Ball says: ${respones[randomIndex]}")
        }
    }
}