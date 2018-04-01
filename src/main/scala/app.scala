import cons.Coffee

/**
  * Created by z3470247 on 31/03/2018.
  */
object RunApp {
  def main(args: Array[String]) {
    val usualCoffee = new Coffee
    val mochaCoffee = new Coffee(shots = 3, syrup = "Chocolate")

  }
}
