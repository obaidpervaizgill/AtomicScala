package co

/**
  * Created by z3470247 on 1/04/2018 to show that similar methods on a single object could be grouped
  */
object CompObjSolo {
  var n:Int = 0
  def increment() = { n += 1; n }
  def count() = increment()
}
