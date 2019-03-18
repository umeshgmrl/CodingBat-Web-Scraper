/*Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 1
1, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true
, equality is allowed, such as 5 5 7 or 5 5 5.inOrderEqual(2, 5, 11, false) → trueinOrderE
qual(5, 7, 6, false) → falseinOrderEqual(5, 5, 7, true) → true*/

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk)
  {
    if(b>=a&&c>=b) return true;
    return false;
  }
  if(b>a&&c>b) return true;
  return false;
}
