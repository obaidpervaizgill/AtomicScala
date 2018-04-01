package fao

/**
  * Created by z3470247 on 31/03/2018 to show anonymous function usage
  */
class SortVector (n:Int*){
  var vDesc = n.sortWith((i,j) => j < i)
  var vAsc = n.sortWith((i,j) => i < j)}
