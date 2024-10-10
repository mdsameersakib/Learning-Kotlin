fun main() { //main is the function that is needed to start. fun = Function

  //Printing
  println("Hello World") // In kotlin, println() is used to print lines of string, int, floats etc
  println("What's your name?")
  val username = readLine() // readLine() is case sensitive and it takes user input
  println("Hello $username. let's get started!!!") // $prints out the value. 

  //Value and Variable
  var name = "Sameer" // Variables can be changed 
  val email = "mdsameersakib" // Values are permanent and cannot be changed. 
  var fnumber = 1.212f // f here is to tell that the value is float.

  //Data Types
  val bytenumber: Byte = 10 // Byte 8 bits | -+(128)
  val shortnumber: Short = 200 // When using short number
  val intnumber: Int = 10 // Can be used in most cases
  val floatnumber: Float = 10.1254f // When number is float
  val Doublenumber: Double = 10 // When number is float but needs accuracy
  val letter: Char = "a" // Letters
  
  //Operators 
  val firstnumber = 10.5f
  val secondnumber = 5.5f
  val add = firstnumber + secondnumber
  val subtract = firstnumber - secondnumber
  val multiply = firstnumber * secondnumber
  val divide = firstnumber / secondnumber
  val mod = firstnumber % secondnumber

  //Assginment Operators
  var total = 0
  total += 5 // Total = Total + 5
  total -= 5 // Total = Total - 5
  total /= 5 // Total = Total / 5
  total *= 5 // Total = Total * 5
  total %= 5 // Total = Total % 5

  // Increment Decrement
  ++total // Total+=1
  --total // Total-=1
  
  //2nd type
  total++ // Total+=1 but after the value is shown
  total-- // Total-=1 but after the value is shown

  // Booleyan 
  var isworking = True 
  if (isworking) { // Checks if isworking is True
    print("It is Working")
  }
  if (!isworking) { // Checks if isworking is False
    print("It is not Working")
  }

  // COMPARE OPERTAORs 

  if (firstnumber == secondnumber) {
    //Checks if equal
  }
  
  if (firstnumber != secondnumber) {
    //Checks if not equal
  }
  
  if (firstnumber <= secondnumber) {
    //Checks if 1st is smaller or equal
  }
  
  if (firstnumber >= secondnumber) {
    //Checks if 1st is greater or equal
  }
  
  if (firstnumber >= secondnumber && firstnumber == secondnumber) {
    //Checks if 1st AND 2nd
  }

   if (firstnumber >= secondnumber || firstnumber == secondnumber) {
    //Checks if 1st OR 2nd
  }
   
}

