

object Test { 
  def factorial(x:BigInt):BigInt =
    if(x == 0) 1 else x* factorial(x-1)
  
  def main(args: Array[String]){
      val big =new java.math.BigInteger("123456789101112")
      
      
      val greetStrings : Array[String] = new Array[String](3)
      val numNames = Array("zero","one","two")
      greetStrings(0)= "Hello"
      greetStrings.update(1,"," ) 
      greetStrings(2) = "world!\n"
       
      for(i<-0 to 2)
        {
        println(greetStrings(i))
  
        Console println numNames.apply(i)
        }
      
      val oneToThree = List(1,2,3)
      val oneTwo = List(1,2)
      
      val threeFour = List(3,4)
      val oneToFour = oneTwo:::threeFour//link two List
      
      println(oneToFour)
      val twoToFour = threeFour.::(2)//val twoToFour = 2::threeFour//add to the head
      println(twoToFour)
      
      val thrill = "Will"::"fill"::"util"::Nil
      println(thrill(2))
      println(thrill.count(s => s.length()==4))
      println(thrill.drop(2))//remove 2 from head
      println(thrill.dropRight(2))
      if (thrill.exists { x => x=="util" })
        println("util is exist!")
        
      println(thrill.filter { x => x.length()==4 })  
      println(thrill.forall { x => x.endsWith("l") })
      //thrill.foreach { x => print(x) }
       thrill.foreach {print}
      
      
      Console println thrill.head
      Console println thrill.init//without the last one
      Console println thrill.isEmpty
      Console println thrill.last
      Console println thrill.length
      Console println thrill.map { x => x+"y" }//every String add a "y" at tail
      Console println thrill.mkString(", ")//return the String consist all the elements of list
      //thrill.remove(s => s.length == 4) it can't work , and the API doc doesn't mention it
      Console println thrill.reverse
      Console println thrill.sorted
      Console println thrill.sortWith((s,t)=> s.charAt(0).toLower< t.charAt(0).toLower)
      Console println thrill.tail //without the first one
      
      
      
      
      
        
      
      
    
       
          }
}

