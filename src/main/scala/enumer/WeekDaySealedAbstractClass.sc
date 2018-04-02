/*
This is done to avoid the issue of non-exhaustive matches in enumeration
Sealed abstract class can be be used to improve in Sealed traits to extend its scope
However the issue is that there is no order hence we need to add an order
Its an abstract class because its values are defined later
*/
sealed abstract class Weekday( val name: String,
                               val abbreviation: String,
                               val isWeekDay: Boolean,
                               val order: Int) extends Ordered[Weekday] {

  def compare(that: Weekday) = this.order - that.order //one class v another of same
}

case object Monday extends Weekday("Monday", "Mo.", true, 2)
case object Tuesday extends Weekday("Tuesday", "Tu.", true, 3)
case object Wednesday extends Weekday("Wednesday", "We.", true, 4)
case object Thursday extends Weekday("Thursday", "Th.", true, 5)
case object Friday extends Weekday("Friday", "Fr.", true, 6)
case object Saturday extends Weekday("Saturday", "Sa.", false, 7)
case object Sunday extends Weekday("Sunday", "Su.", false, 1)

Monday.compare(Tuesday)
Monday > Tuesday

Monday.isWeekDay
Monday < Tuesday