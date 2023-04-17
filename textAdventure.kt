fun main() {
    val roomList = arrayOfNulls<Array<Any?>>(7)

    //Bedroom 2 - 0
    roomList[0] = arrayOf("You are in a dusty castle room.\nYou see exits leading to the North and East.", 3, 1, null, null)

    //South Hall - 1
    roomList[1] = arrayOf("You are in the South Hall.\nYou see exits leading to the North, East, and West.", 4, 2, null, 0)

    //Dining Room - 2
    roomList[2] = arrayOf("You are in a dark dining room.\nYou see exits leading North and West.", 5, null, null, 1)

    //Bedroom 1 - 3
    roomList[3] = arrayOf("You are in an old, dusty, bedroom.\nYou see exits leading East and South.", null, 4, 0, null)

    //North Hall - 4
    roomList[4] = arrayOf("You are walking down the dark and gloomy North Hall.\nYou see exits leading in all directions.", 6, 5, 1, 3)

    //Kitchen - 5
    roomList[5] = arrayOf("You are in an empty kitchen.\nYou see to the West and South.", null, null, 2, 4)

    //Balcony - 6
    roomList[6] = arrayOf("You are now outside on the balcony overlooking the castle garden.\nThe only exit is to the South.", null, null, 4, null)

    var currentRoom = 0
    var done = false

    //main loop
    println("Reach the balcony to exit the castle.")
    println("")
    while (!done) {
        println(roomList[currentRoom]?.get(0))
        //user input
        print("What direction do you want to go? (Type n, s, e, or w) ")
        val direction = readln().lowercase()

        //Determine the next room
        val nextRoom: Int? = when (direction) {
            "n" -> roomList[currentRoom]?.get(1) as Int?
            "e" -> roomList[currentRoom]?.get(2) as Int?
            "s" -> roomList[currentRoom]?.get(3) as Int?
            "w" -> roomList[currentRoom]?.get(4) as Int?
            else -> {
                println("Invalid. Enter 'n', 'e', 's', or 'w'.")
                null
            }
        }

        if (nextRoom != null) {
            currentRoom = nextRoom
        } else {
            println("It is impossible to go that way.")
        }

        //end game
        if (nextRoom == roomList.size - 1) {
            done = true
            println("You have reached the balcony. Congratulations")
        }
    }
}