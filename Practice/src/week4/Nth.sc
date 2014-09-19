import  week4._

object Nth {
  
			def nth[T] (n: Int, xs: List[T]):T=
			if(n==0) xs.head
			else nth(n-1,xs.tail)     //> nth: [T](n: Int, xs: week4.List[T])T
			
			
			def list=new Cons(1,new Cons(2,new Cons(3,new Nil)))
                                                  //> list: => week4.Cons[Int]
			nth(2,list)               //> res0: Int = 3
}