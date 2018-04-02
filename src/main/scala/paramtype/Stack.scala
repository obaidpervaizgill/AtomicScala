package paramtype

/**
  * Created by z3470247 on 2/04/2018.
  */
class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) {elements = x :: elements}
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}
