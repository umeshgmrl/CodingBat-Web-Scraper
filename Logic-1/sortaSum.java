/*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are 
forbidden, so in that case just return 20.sortaSum(3, 4) → 7sortaSum(9, 4) → 20sortaSum(10
, 11) → 21*/

public int sortaSum(int a, int b) {
  int sum= a+b;
  if(sum>9&&sum<20)
  {
    return 20;
  }
  return sum;
}
