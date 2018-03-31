package cons

/**
  * Created by z3470247 on 31/03/2018.
  */
class Coffee (val shots:Int = 1,
              val decaf:Boolean = false,
              val milk:Boolean = false,
              val toGo:Boolean = false,
              val syrup:String = "") {
  var result = ""

  def getCup():Unit = {
     if(toGo)
       result += "ToGoCup "
     else
        result += "HereCup "
     }
   def pourShots():Unit = {
     for(s <- 0 until shots)
       if(decaf)
       result += "decaf shot "
     else
        result += "shot "
     }
   def addMilk():Unit = {
     if(milk)
       result += "milk "
     }
   def addSyrup():Unit = {
     result += syrup
       }
   getCup()
   pourShots()
   addMilk()
   addSyrup()

  println(result)
}
