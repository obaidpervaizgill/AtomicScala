object Color extends Enumeration {
   type Color = Value
   val red, blue, yellow, purple,
   green, orange, brown = Value
   }

import Color._
object colorblend {

   def blend(a:Color, b:Color) =
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

val out = for (a <- Color.values; b <- Color.values; c = colorblend.blend(a,b)) yield (c)


out.foreach(println)




