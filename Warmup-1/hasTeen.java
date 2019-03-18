/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int valu
es, return true if 1 or more of them are teen.hasTeen(13, 20, 10) → truehasTeen(20, 19, 10
) → truehasTeen(20, 10, 13) → true*/

public boolean hasTeen(int a, int b, int c) {
  
  return ((a>12&&a<20)||(b>12&&b<20)||(c>12&&c<20));
}
