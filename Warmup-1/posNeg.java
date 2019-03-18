/*Given 2 int values, return true if one is negative and one is positive. Except if the para
meter "negative" is true, then return true only if both are negative.posNeg(1, -1, false) 
→ trueposNeg(-1, 1, false) → trueposNeg(-4, -5, true) → true*/

public boolean posNeg(int a, int b, boolean negative) {
  if((a<0||b<0)&&(a>0||b>0)&&(negative==false)) return true;
  if(negative==true&&(a<0&&b<0)) return true;
  else return false;
}
