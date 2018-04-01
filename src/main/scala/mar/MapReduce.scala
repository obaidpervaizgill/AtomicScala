package mar

/**
  * Created by z3470247 on 1/04/2018.
  */
object MapReduce {
  val v = Vector(1,2,3,4,5)

  val v2 = () => v.map(n => n + 1)

  val v3 = () => {var sum = 0;v.foreach(x => sum += x);sum}

  val v4 = () => v.reduce((sum,n) => sum + n)
}
