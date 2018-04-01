val v = Vector(1,2,3,5,6,7,8,10,13,14,17)

//var result = Vector[Int]()

//for(a <- v if a > 5 if a%2 == 0) {result = result :+ a;println(result)}

def evenGT5(v:Vector[Int]):Vector[Int] = {
  var result = Vector[Int]()
  for {n <- v if n > 5 if n % 2 == 0} {
    result = result :+ n
  }
  result
}

evenGT5(v)

def evenGT5Yield (v:Vector[Int]):Vector[Int] = {
  val result = for {n <- v if n > 5 if n%2 == 0} yield {n}
  result
}

evenGT5Yield(v)

def evenGT5YieldTwo (v:Vector[Int]):Vector[Int] = {
  val result = for {n <- v
                    if n > 5
                    isEven =(n % 2 == 0)
                    if (isEven)
  } yield {n}
  result
}
evenGT5YieldTwo(v)

def evenGT5YieldThree(v:Vector[Int]):Vector[Int] = {
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
evenGT5YieldThree(v)

