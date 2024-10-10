fun main() {
  val stringInput = readLine()!! //Takes whatever you input as string
  println("Input was: ${stringInput.toInt()}")

  try {
    
    val userInput = Scanner(System, 'in')
    val number = userInput.nextInt() // Will look for next integer
    println("Number input: $number")
    
  } catch (e: Exception) {
    
    println("Not a number"}
    println("Exception: $e")
    
  }
    
}
