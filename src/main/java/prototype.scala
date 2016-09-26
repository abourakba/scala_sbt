/**
 * Created by abdou on 01/09/16.
 */



object prototype {

  def main(args:Array[String]){
    println("Coucou Sbt");
    val maConstante = "Constant"
    var maVariabale:String = "Variable"

    def maFonction(arg1:String,arg2:String) : Int = {
      return 0
    }
    maFonction(maConstante,maVariabale)

    def fonctionSansArg(): String ={
      return "toto";
    }

    fonctionSansArg()

    def greet = { println("Hello I do not return Anything :)")}
    greet




  }

}