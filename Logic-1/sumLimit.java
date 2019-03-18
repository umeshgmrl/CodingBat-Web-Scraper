/*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same numb
er of digits as a. If the sum has more digits than a, just return a without b. (Note: one 
way to compute the number of digits of a non-negative int n is to convert it to a string w
ith String.valueOf(n) and then check the length of the string.)sumLimit(2, 3) → 5sumLimit(
8, 3) → 8sumLimit(8, 1) → 9*/

public int sumLimit(int a, int b) {
  int sum= a+b;
  String aValue= Integer.toString(a);
  int aLength= aValue.length();
  String sumValue= Integer.toString(sum);
  int sumLength= sumValue.length();
  if(sumLength>aLength) return a;
  return a+b;
}
