fun main() {

  // IN , NOT IN....

  var numbers = listOf(1, 2, 3, 5) // Makes a list of given inputs
  var randnumber = (1..10).random() // .. is from this to that || And random() takes a random value from that list

  if (randomnumber in numbers) { 
    println("Random is in Numbers")
  } else {
    println("Randomn is not in Numbers") 

  if (randomnumber !in numbers) { 
    println("Random is not in Numbers")
  } else {
    println("Randomn is in Numbers") 
  
}
