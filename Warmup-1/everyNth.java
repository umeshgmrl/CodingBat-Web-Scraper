/*Given a non-empty string and an int N, return the string made starting with char 0, and th
en every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or 
more.everyNth("Miracle", 2) → "Mrce"everyNth("abcdefg", 2) → "aceg"everyNth("abcdefg", 3) 
→ "adg"*/

public String everyNth(String str, int n) {
  String s="";
  s= s+ str.charAt(0);
  for(int i=n;i<str.length();i+=n)
  {
    s+=str.charAt(i);
  }
  return s;
}
