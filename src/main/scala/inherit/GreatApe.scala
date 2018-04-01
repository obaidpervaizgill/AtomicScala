package inherit

/**
  * Created by z3470247 on 1/04/2018.
  */
class GreatApe {
  def call = "Hoo!"
  var energy = Energy.monkeyEnergy
  def eat() = { energy += 10; energy }
  def climb(x:Int) = energy -= x
}
