class GreatApe {
  def call = "Hoo!"
  var energy = 3
  def eat() = { energy += 10; energy }
  def climb(x:Int) = energy -= x
}

val kk = new GreatApe

kk.energy
kk.eat()
kk.climb(3)
kk.energy
trait Name {
  def name = "Monkey"
}

class Bonobo extends GreatApe with Name{
  override def call = "Eep!"
  energy = 5
  override def eat() = super.eat() * 2
}

val b = new Bonobo
b.eat()
b.name