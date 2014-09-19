package OderskyAssignments

object ParanthesisBalancing {


def balanced(chars: List[Char], open: Int): Boolean = {
        if (chars.isEmpty) open == 0
            else if (chars.head == '(') balanced(chars.tail,open+1)
                else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
                    else balanced(chars.tail,open)
    }                                             //> balanced: (chars: List[Char], open: Int)Boolean

 def balance(chars: List[Char]): Boolean = {
    
    balanced(chars,0)
 }                                                //> balance: (chars: List[Char])Boolean
 
 
 
 def vars="I1 told him (that it�s not (yet) done). (But he wasn�t listening))"
                                                  //> vars: => String
 def vars1=vars.toList                            //> vars1: => List[Char]
 balance(vars1)                                   //> res0: Boolean = false
 
}