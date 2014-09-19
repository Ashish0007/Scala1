import  week4._

object Nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
  
			def nth[T] (n: Int, xs: List[T]):T=
			if(n==0) xs.head
			else nth(n-1,xs.tail);System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(64); 
			
			
			def list=new Cons(1,new Cons(2,new Cons(3,new Nil)));System.out.println("""list: => week4.Cons[Int]""");$skip(15); val res$0 = 
			nth(2,list);System.out.println("""res0: Int = """ + $show(res$0))}
}
