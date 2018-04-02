// SodaFountain.scala
package sodafountain
object Quantity extends Enumeration {
  type Quantity = Value
  val None, Small, Regular, Extra, Super = Value
}
//import Quantity._

object Holder extends Enumeration {
  type Holder = Value
  val Bowl, Cup, Cone, WaffleCone = Value
}
//import Holder._

trait Flavor

object Syrup extends Enumeration {
  case class _Val() extends Val with Flavor

  type Syrup = _Val
  val Chocolate, HotFudge,Butterscotch, Caramel = _Val()
}



