/*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclus
ive, are extra lucky. So if either value is a teen, just return 19.teenSum(3, 4) → 7teenSu
m(10, 13) → 19teenSum(13, 2) → 19*/

public int teenSum(int a, int b) {
  if((b>12&&b<20)||(a>12&&a<20))
  {
    return 19;
  }
  return a+b;
}
