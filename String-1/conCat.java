/*Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" 
and "cat" yields "abcat".conCat("abc", "cat") → "abcat"conCat("dog", "cat") → "dogcat"conC
at("abc", "") → "abc"*/

public String conCat(String a, String b) {
  if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1)))
  {
    return a+b.substring(1,b.length());
  }
  return a+b;
}
