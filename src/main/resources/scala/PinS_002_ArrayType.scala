import scala.Predef.long2Long

/**
 * Created by abdou on 14/09/16.
 */


for (i <- 0 to 2 ){
  println("J'ai les numero %s".format(i))
}
println( (1).+(2) )

for(i<-(0).to(10)){
  print("[%s] ".format(i))
}
println()
println( (1).to(9) )


class TEST_METHOD{
  var value = 1 ;
  def apply( i: Int): Unit ={
    value = i
  }
  /*
  def update( a:Any , b:Any  ): Unit ={

  }
  */
}

var abdou = new TEST_METHOD();
abdou(2);
// abdou(3,4);


// Creation d'une liste
val oneTwoThree = List(1,2,3)
val oneTwoThreeType:List[Int] = List(1,2,3)
val liste:List[Any] = List(1,"Abdou",2/3)

val oneTwo = List(1,2)
val threeFour = List(3,4)
// Permet de concatener des listes
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new List.")
// Permet de concatener des elements à la liste vide (=Nil).
val oneTwoThree_v2 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree_v2)




