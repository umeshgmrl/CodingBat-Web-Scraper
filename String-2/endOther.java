/*Given two strings, return true if either of the strings appears at the very end of the oth
er string, ignoring upper/lower case differences (in other words, the computation should n
ot be "case sensitive"). Note:  str.toLowerCase() returns the lowercase version of a strin
g.endOther("Hiabc", "abc") → trueendOther("AbC", "HiaBc") → trueendOther("abc", "abXabc") 
→ true*/

public boolean endOther(String a, String b) {
  a= a.toLowerCase();
  b= b.toLowerCase();
  if(a.length()==b.length()&&a==b) return true;
  else if(a.length()>b.length()&&a.substring(a.length()-b.length()).equals(b)) return true;
  else if(b.length()>a.length()&&b.substring(b.length()-a.length()).equals(a)) return true;
  return false;
}
