/*Given two temperatures, return true if one is less than 0 and the other is greater than 10
0.icyHot(120, -1) → trueicyHot(-1, 120) → trueicyHot(2, 120) → false*/

public boolean icyHot(int temp1, int temp2) {
  if((temp1>100&&temp2<0)||(temp1<0&&temp2>100)) return true;
  else return false;
}
