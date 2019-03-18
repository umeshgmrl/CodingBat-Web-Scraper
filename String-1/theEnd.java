/*Given a string, return a string length 1 from its front, unless front is false, in which c
ase return a string length 1 from its back. The string will be non-empty.theEnd("Hello", t
rue) → "H"theEnd("Hello", false) → "o"theEnd("oh", true) → "o"*/

public String theEnd(String str, boolean front) {
  if(front==true)
  {
    return str.substring(0,1);
  }
  return str.substring(str.length()-1,str.length());
}
