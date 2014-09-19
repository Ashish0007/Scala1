package OderskyAssignments

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(123); 
  	
  			def fact(num:Int):Int=
  			if(num<=1) 1
  				else num*fact(num-1);System.out.println("""fact: (num: Int)Int""");$skip(81); 
  			
  				
 
 			def pascal(c:Int,r:Int):Int=
 				fact(r)/(fact(c)*fact(r-c));System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(55); val res$0 = 
                                       
 
 pascal(2,5);System.out.println("""res0: Int = """ + $show(res$0))}
        
}
