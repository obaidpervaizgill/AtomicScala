import cons.Coffee
import enumer.WeekDay

/**
  * Created by z3470247 on 31/03/2018.
  */
object Runner extends App {
  val usualCoffee = new Coffee
  val mochaCoffee = new Coffee(shots = 3, syrup = "Chocolate")

   WeekDay.values.foreach(println)
}
