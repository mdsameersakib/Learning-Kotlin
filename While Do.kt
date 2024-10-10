fun main() {
    var sum = 0
    var userInput: String

    do {
        print("Enter Number: ")
        userInput = readLine()!!
        sum += userInput.toInt()
    } while (userInput != "1")

    println("Total: $sum")
}
