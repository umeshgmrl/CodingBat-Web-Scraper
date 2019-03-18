/*Given a string, if one or both of the first 2 chars is 'x', return the string without thos
e 'x' chars, and otherwise return the string unchanged. This is a little harder than it lo
oks.withoutX2("xHi") → "Hi"withoutX2("Hxi") → "Hi"withoutX2("Hi") → "Hi"*/

public String withoutX2(String str) {
  if(str.length()<2)
  {
    if(str.equals("x")) return "";
    return str;
  }
  if(str.substring(0,1).equals("x")&&str.substring(1,2).equals("x")) return str.substring(2);
  if(str.substring(0,1).equals("x")) return str.substring(1);
  if(str.substring(1,2).equals("x")) return str.substring(0,1)+str.substring(2);
  
  return str;
}
