/*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost 
digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multipl
e of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b 
c, return the sum of their rounded values. To avoid code repetition, write a separate help
er "public int round10(int num) {" and call it 3 times. Write the helper entirely below an
d at the same indent level as roundSum().roundSum(16, 17, 18) → 60roundSum(12, 13, 14) → 3
0roundSum(6, 4, 4) → 10*/

public int roundSum(int a, int b, int c) {
  a= round10(a);
  b= round10(b);
  c= round10(c);
  return a+b+c;
}
public int round10(int num){
  if(num%10<5) return num-num%10;
  return num+(10-num%10);
}
