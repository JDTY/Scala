

object Test { 
  def factorial(x:BigInt):BigInt =
    if(x == 0) 1 else x* factorial(x-1)
  
  def main(args: Array[String]){
    var capital = Map("US"->"Washington","France"->"Paris")
    
    capital += ("Japan"->"Tokyo")
     
    println(capital("Japan"))
     
    println(factorial(30))
    
    println("Hello World!")
  }
}