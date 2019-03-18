/*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for 
example 38 and 39 return true, but 40 returns false. See also: Introduction to Modless20(1
8) → trueless20(19) → trueless20(20) → false*/

public boolean less20(int n) {
  int a= n+1;
  int b= n+2;
 if(a%20==0||b%20==0) return true;
 return false;
}
