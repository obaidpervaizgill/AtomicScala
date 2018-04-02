/*
This is done to avoid the issue of non-exhaustive matches in enumeration
Sealed trait can be used with case objects to avoid the issue
The test function without sealed trait would otherwise not run
 */

sealed trait Weekday

case object Monday extends Weekday
case object Tuesday extends Weekday
case object Wednesday extends Weekday
case object Thursday extends Weekday
case object Friday extends Weekday
case object Saturday extends Weekday
case object Sunday extends Weekday

def test(weekday: Weekday) = {
  weekday match {
    case Monday => println("I hate Mondays")
    case Sunday => println("The weekend is already over? :( ")
  }
}