package utraits

/**
  * Created by z3470247 on 2/04/2018.
  */
trait Aerobic {
  val age:Int
  def minAerobic = 0.5 * (220 - age)
  def isAerobic(heartRate:Int) = heartRate > minAerobic
}
