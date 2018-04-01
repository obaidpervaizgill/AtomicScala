package fao

/**
  * Created by z3470247 on 31/03/2018.
  */
class Later (val f:() => Unit) { //takes an empty function parameter and returns print
  def call():Unit = {f()}
}

/*
//through class
val cl = new Later(() => println("now"))
cl.call
//or
//through function
val later1 = () => println("now")
*/