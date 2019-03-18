/*Given three ints, a b c, return true if two or more of them have the same rightmost digit.
 The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 1
0 is 7.lastDigit(23, 19, 13) → truelastDigit(23, 19, 12) → falselastDigit(23, 19, 3) → tru
e*/

public boolean lastDigit(int a, int b, int c) {
  
    int x= a%10;
    int y= b%10;
    int z= c%10;
    
    if(x==y||y==z||z==x)
    {
      return true;
    }
  return false;
}
