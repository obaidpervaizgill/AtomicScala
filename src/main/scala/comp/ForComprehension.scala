package comp

/**
  * Created by z3470247 on 1/04/2018.
  */
class ForComprehension (v:Vector[Int]){

  def evenGT5():Vector[Int] = {
    var result = Vector[Int]()
    for {n <- v if n > 5 if n % 2 == 0} {
      result = result :+ n
    }
    result
  }

  def evenGT5Yield ():Vector[Int] = {
    val result = for {n <- v if n > 5 if n%2 == 0} yield {n}
    result
  }

  def evenGT5YieldTwo ():Vector[Int] = {
    val result = for {n <- v
                      if n > 5
                      isEven =(n % 2 == 0)
                      if (isEven)
    } yield {n}
    result
  }

  def evenGT5YieldThree():Vector[Int] = {
    val result = for {n <- v
                      if n > 5
                      isEven =(n % 2 == 0)
                      if (isEven)
    } yield {
      val u = n * 10
      u / 10
    }
    result
  }

}
