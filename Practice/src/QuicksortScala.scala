object QuicksortScala {  
  
  def quicksort(xs: Array[Int]) {  
      
    def swap(i: Int, j: Int) {  
      val t = xs(i); xs(i) = xs(j); xs(j) = t  
    }  
      
    def sort1(l: Int, r: Int) {  
      val pivot = xs((l + r) / 2)  
      var i = l;   
      var j = r  
      while (i <= j) {  
        while (xs(i) < pivot) i += 1  
        while (xs(j) > pivot) j -= 1  
        if (i <= j) {  
          swap(i, j)  
          i += 1  
          j -= 1  
        }  
      }  
      if (l < j) sort1(l, j)  
      if (r > i) sort1(i, r)  
    }  
    sort1(0, xs.length - 1)  
  }  
    
  def main(args : Array[String]) {  
    var a : Array[Int] = new Array[Int](100000)  
    var i : Int = 0  
    for (e <- a) {  
      a(i) = i*3/2+1;  
   if (i%3==0) a(i) = -a(i);  
      i = i+1  
    }  
    val t1 = System.currentTimeMillis();  
    quicksort (a)  
    val t2 = System.currentTimeMillis();  
    println(t2-t1)  
  }  
}  