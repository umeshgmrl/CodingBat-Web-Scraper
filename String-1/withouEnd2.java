/*Given a string, return a version without both the first and last char of the string. The s
tring may be any length, including 0.withouEnd2("Hello") → "ell"withouEnd2("abc") → "b"wit
houEnd2("ab") → ""*/

public String withouEnd2(String str) {
  if(str.length()<3) return "";
  
  return str.substring(1,str.length()-1);
}
