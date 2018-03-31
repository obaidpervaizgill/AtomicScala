package ca

/**
  * Created by z3470247 on 31/03/2018 to show overloading in scala
  */
class Sum3 () {
  def result(a1:Int, a2:Int, a3:Int):Int = { a1 + a2 + a3}
  def result(a1:Double, a2:Double, a3:Double):Double = { a1 + a2 + a3}
}
