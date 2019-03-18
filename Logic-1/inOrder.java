/*Given three ints, a b c, return true if b is greater than a, and c is greater than b. Howe
ver, with the exception that if "bOk" is true, b does not need to be greater than a.inOrde
r(1, 2, 4, false) → trueinOrder(1, 2, 1, false) → falseinOrder(1, 1, 2, true) → true*/

public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk)
  {
    if(b<c) return true;
    return false;
  }
  if(a<b&&b<c) return true;
  return false;
}
