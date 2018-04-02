/**
  * Created by z3470247 on 2/04/2018.
  */
package object RandFunc { //becomes a package call should be recur.{rPrint,sumIt}
  def rPrint(s:Seq[String]):Unit = {
    println(s.head)
    if(s.tail.nonEmpty) {
      rPrint(s.tail)
    }
  }

  //rPrint(Seq("a","b","c","d"))

  def sumIt(s:Seq[Int],res:Int = 0):Int = {
    if(s.isEmpty) {
      res
    } else {
      sumIt(s.tail, s.head + res)
    }
  }

  //sumIt(Seq(1,2,3,4,5,6))
}
