package co

/**
  * Created by z3470247 on 1/04/2018 to show how companion object can be called within a class
  */
class ClassCompObj {
  def increment() = {CompObj.n += 1; CompObj.n}
}
