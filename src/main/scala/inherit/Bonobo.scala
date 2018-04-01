package inherit

/**
  * Created by z3470247 on 1/04/2018.
  */
class Bonobo extends GreatApe with Name {
  override def call = "Eep!"
  energy = Energy.monkeyEnergy + 2
  override def eat() = super.eat() * 2  //executes the superclass method and multiplies it by 2
  def run() = "Bonobo runs"
}
