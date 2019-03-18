/*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it d
oes not count towards the sum and values to its right do not count. So for example, if b i
s 13, then both b and c do not count.luckySum(1, 2, 3) → 6luckySum(1, 2, 13) → 3luckySum(1
, 13, 3) → 1*/

public int luckySum(int a, int b, int c) {
  int sum=0;
  if(a==13) return sum;
  sum+=a;
  if(b==13) return sum;
  sum+=b;
  if(c==13) return sum;
  sum+=c;
  return sum;
}
