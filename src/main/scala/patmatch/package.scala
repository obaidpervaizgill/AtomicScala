package patmatch

/**
  * Created by z3470247 on 2/04/2018.
  */

package object colorblend {

  import patmatch.Color._

  def blend(a: Color, b: Color) = {
    (a, b) match {
      case _ if a == b => a
      case (`red`, `blue`) |
           (`blue`, `red`) => purple
      case (`red`, `yellow`) |
           (`yellow`, `red`) => orange
      case (`blue`, `yellow`) |
           (`yellow`, `blue`) => green
      case (`brown`, _) |
           (_, `brown`) => brown
      case _ => // Interesting, not accurate:
        Color((a.id + b.id) % Color.maxId)
    }
  }
}