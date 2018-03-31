package ca

/**
  * Created by z3470247 on 31/03/2018 to show that a function can take as many arguments as needed
  */
class Sum(args:Int*){
  def result():Int = {
    var total = 0
    for(n <- args){
      total += n
      }
    total
  }
}
