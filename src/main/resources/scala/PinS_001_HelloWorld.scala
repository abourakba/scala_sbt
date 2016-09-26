// Mon Commentaire dans le script !
println("Hello, world, from a script!")

for(i <- 0 to  args.length-1 ){
  println(args(i))
}

var index = 0 ; // Initialise et cast en Scala.Int
while ( index <  args.length ) {
  print(args(index) + "  ")
  index += 1
}
println()
println("-------------------------- Avec un foreach --------------------------")
args.foreach( s => { println(s) } ) // le foreach prend une fonction en parametre !!!!!
args.foreach( println  ) // Ici on est encore plus concis.





