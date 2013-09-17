// 1st approach: Say hello to first argument
println ("Hello " + args(0) + "!")

// 2nd approach: Show all arguments with while
println ("2nd approach")
var i = 0
while (i<args.length) {
  if (i!=0)
    print (" ")
  print (args(i))
  i+=1
}
println()

// 3rd approach: literal functions
println ("3rd approach")
args.foreach(arg => println(arg))

// 4th approach: for
println ("4th approach")
for (arg <- args)
  println (arg)