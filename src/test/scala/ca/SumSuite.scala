package ca

import org.scalatest.FunSuite

/**
  * Created by z3470247 on 31/03/2018.
  */
class SumSuite extends FunSuite {
  test("sum of a sequence of numbers is printed") {
    assert(6 == new Sum(1,2,3).result())
    assert(3 == new Sum(0,1,2).result())
  }
}