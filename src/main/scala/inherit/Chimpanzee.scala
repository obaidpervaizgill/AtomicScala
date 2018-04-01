package inherit

/**
  * Created by z3470247 on 1/04/2018.
  */
class Chimpanzee extends GreatApe with Name{
  override def call = "Yawp!"
  override def eat() = super.eat() * 3
  def jump = "Chimp jumps"
  val kind = "Common"
}
