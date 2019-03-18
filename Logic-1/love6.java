/*The number 6 is a truly great number. Given two int values, a and b, return true if either
 one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes t
he absolute value of a number.love6(6, 4) → truelove6(4, 5) → falselove6(1, 5) → true*/

public boolean love6(int a, int b) {
  int t= Math.abs(a-b);
  int d= a+b;
  if(a==6||b==6||t==6||d==6) return true;
  return false;
}
