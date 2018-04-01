package traits

/**
  * Created by z3470247 on 1/04/2018.
  */
object HandleACollisionB extends A with B {
  override def f = 9.9
  override val n = 27
  override def g = super[A].g + super[B].g
}
