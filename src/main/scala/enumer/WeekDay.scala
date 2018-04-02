package enumer

/**
  * Created by z3470247 on 2/04/2018 to show a short hand rather than case object Monday extends Weekday repetitively
  */
object WeekDay extends Enumeration{
  type WeekDay = Value
  val Mon, Tue, Wed, Thur, Fri, Sat, Sun = Value
}
