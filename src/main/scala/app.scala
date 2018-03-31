import nda.Family

/**
  * Created by z3470247 on 31/03/2018.
  */
object App {
  def main(args: Array[String]) {
    val f = new Family(mom = "Mom", dad = "Dad", kids = "Sammy","Lammy")
    println(f.mom)
  }
}
