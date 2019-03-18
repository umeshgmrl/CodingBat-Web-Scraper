/*Given a string, return a version where all the "x" have been removed. Except an "x" at the
 very start or end should not be removed.stringX("xxHxix") → "xHix"stringX("abxxxcd") → "a
bcd"stringX("xabxxxcdx") → "xabcdx"*/

public String stringX(String str) {
  char[] charArray = str.toCharArray();
  for(int i=1; i<str.length()-1;i++)
  {
    if(charArray[i]=='x')
    {
      charArray[i] = ' ';
    }
  
  }
  return String.valueOf(charArray).replace(" ", "");
}
