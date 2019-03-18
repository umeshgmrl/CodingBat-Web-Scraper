/*Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in
 the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count 
as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int valu
e and returns that value fixed for the teen rule. In this way, you avoid repeating the tee
n code 3 times (i.e. "decomposition"). Define the helper below and at the same indent leve
l as the main noTeenSum().noTeenSum(1, 2, 3) → 6noTeenSum(2, 13, 1) → 3noTeenSum(2, 1, 14)
 → 3*/

public int noTeenSum(int a, int b, int c) {
  a= fixTeen(a);
  b= fixTeen(b);
  c= fixTeen(c);
  return a+b+c;
}
public int fixTeen(int n){
  if((n>12&&n<15)||(n>16&&n<20)) return 0;
  return n;
}
