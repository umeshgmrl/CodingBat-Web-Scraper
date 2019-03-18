/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int valu
es, return true if one or the other is teen, but not both.loneTeen(13, 99) → trueloneTeen(
21, 19) → trueloneTeen(13, 13) → false*/

public boolean loneTeen(int a, int b) {
  int temp=0;
  if(a>12&&a<20) temp++;
  if(b>12&&b<20) temp++;
  if(temp==1) return true;
  return false;
}
