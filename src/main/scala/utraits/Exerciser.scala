package utraits

/**
  * Created by z3470247 on 2/04/2018.
  */
class Exerciser (age:Int,
                 val action:String = "Running",
                 val go:String = "Run!") extends Person(age) with Activity with Aerobic {
}

