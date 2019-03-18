/*Given 3 int values, a b c, return their sum. However, if one of the values is the same as 
another of the values, it does not count towards the sum.loneSum(1, 2, 3) → 6loneSum(3, 2,
 3) → 2loneSum(3, 3, 3) → 0*/

public int loneSum(int a, int b, int c) {
  int a1=a;
  int b1=b;
  int c1=c;
 if(a==b) 
 {
   a1=0;
   b1=0;
 }
 
 if(b==c)
 {
   b1=0;
   c1=0;
 }
 if(c==a)
 {
   c1=0;
   a1=0;
 }
 return a1+b1+c1;
 
}
