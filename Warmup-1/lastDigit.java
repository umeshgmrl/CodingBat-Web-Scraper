/*Given two non-negative int values, return true if they have the same last digit, such as w
ith 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.lastDig
it(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true*/

public boolean lastDigit(int a, int b) {
  
  return(a % 10 == b % 10);
}
