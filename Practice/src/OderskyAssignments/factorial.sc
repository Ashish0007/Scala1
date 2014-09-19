package OderskyAssignments

object factorial {
  	
  			def fact(num:Int):Int=
  			if(num<=1) 1
  				else num*fact(num-1)
                                                  //> fact: (num: Int)Int
  			
  				
 
 			def pascal(c:Int,r:Int):Int=
 				fact(r)/(fact(c)*fact(r-c))
                                                  //> pascal: (c: Int, r: Int)Int
                                       
 
 pascal(2,5)                                      //> res0: Int = 10
        
}