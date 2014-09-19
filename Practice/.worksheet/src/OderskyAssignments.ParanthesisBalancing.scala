package OderskyAssignments

object ParanthesisBalancing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(359); 


def balanced(chars: List[Char], open: Int): Boolean = {
        if (chars.isEmpty) open == 0
            else if (chars.head == '(') balanced(chars.tail,open+1)
                else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
                    else balanced(chars.tail,open)
    };System.out.println("""balanced: (chars: List[Char], open: Int)Boolean""");$skip(76); 

 def balance(chars: List[Char]): Boolean = {
    
    balanced(chars,0)
 };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(85); 
 
 
 
 def vars="I1 told him (that it?s not (yet) done). (But he wasn?t listening))";System.out.println("""vars: => String""");$skip(23); 
 def vars1=vars.toList;System.out.println("""vars1: => List[Char]""");$skip(16); val res$0 = 
 balance(vars1);System.out.println("""res0: Boolean = """ + $show(res$0))}
 
}
