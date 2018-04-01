package aclass

/**
  * Created by z3470247 on 1/04/2018.
  */
abstract class Animal {
  def animal:String
  def sound:String
  def describe = s"The $animal goes $sound"
}
