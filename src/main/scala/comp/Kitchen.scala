package comp

/**
  * Created by z3470247 on 2/04/2018.
  */
trait Kitchen extends Room{
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food
  val utensils:Utensils
}
