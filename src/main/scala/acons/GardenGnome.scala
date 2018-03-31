package acons

/**
  * Created by z3470247 on 31/03/2018 to show that overloaded constructors can be used instead of nada
  */
class GardenGnome(val height:Double,
                  val weight:Double,
                  val happy:Boolean) {
  
  def magic(level:Int):String = {
    "Poof! " + level
  }
  def this(height:Double, weight:Double) {
    this(height, weight, true)
  }
  def this() = {
    this(10.0,20.0)//default value for this, which is the auxiliary constructor
  }
  def show():String = {
    height + " " + weight +
      " " + happy + " "
  }
}


