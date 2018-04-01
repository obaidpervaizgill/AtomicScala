package pm

/**
  * Created by z3470247 on 1/04/2018.
  */
class AcceptAnything (x:Any){
  case class Person(name:String)
  def result():String = {
    x match {
      case s:String => "A String: " + s
      case i:Int if(i < 20) => s"An Int Less than 20: $i"
      case i:Int => s"Some Other Int: $i"
      case p:Person => s"A person ${p.name}"
      case _ => "I don't know what that is!"
    }
  }
}
