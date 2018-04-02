package paramtype.polymorph

/**
  * Created by z3470247 on 2/04/2018.
  */
object PolyParamObj {
  //variance
  val getTweet: (Bird => String) = ((a:Bird) => a.sound)
  //example
  //getTweet(new Chicken)
  //getTweet(new Crow)

  //bounds
  def biophony[T <: Bird](things: Seq[T]) = things.map(x => x.sound) // a function that takes seq of Birds
  //example
  //biophony(Seq(new Chicken, new Crow))

  //quantification
  def hashcodes(l: Seq[_ <: Any]) = l.map(x => x.hashCode)
  //hashcodes(Seq(1,2))
}
