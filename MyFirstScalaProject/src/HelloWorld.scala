object HelloWorld {

	def main(args: Array[String]): Unit = {
    
    println("Hello, World!")
    
    // A Function literal
    args.foreach( x => println(x))
 
    // Arrays
    val greetStrings = new Array[String](3)
    // Kurzform von...
    val greetStrings2 : Array[String] = new Array[String](3);
    // () wird übersetzt nach .apply
    val greetStrings3 = Array.apply(3)
    // kann man auch für init benutzen
    val greetStrings4 = Array.apply("Scala", "ist", "cool")
    
    greetStrings(0) = "Scala"
    greetStrings(1) = "ist"
    // = wird transformiert zu .update
    greetStrings.update(2, "cool")
    
    for (i <- 0 to 2) {
    	println (greetStrings(i));
    	// Kurzform von...
    	println (greetStrings.apply(i));
      }
  }
  
}