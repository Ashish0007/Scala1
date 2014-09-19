package week4

import java.util.NoSuchElementException

trait List[T] {
  
  def isEmpty:Boolean
  def head: T
  def tail:List[T]
}

class Cons[T](val head:T,val tail:List[T]) extends List[T]{
  
  def isEmpty=false
}

class Nil[T] extends List[T]{
  
  def isEmpty:Boolean=true
  def head:Nothing= throw new NoSuchElementException("nil.head")
  def tail:Nothing=throw new NoSuchElementException("nil.TAIL")
}

object List{
  
  def apply[T]():List[T]=new Nil
  def apply[T](elem:T):List[T]=new Cons(elem,new Nil)
  def apply[T](elem1:T,elem2:T):List[T]=new Cons(elem1,new Cons(elem2,new Nil))
}