/*Given a string and a non-negative int n, we'll say that the front of the string is the fir
st 3 chars, or whatever is there if the string is less than length 3. Return n copies of t
he front;frontTimes("Chocolate", 2) → "ChoCho"frontTimes("Chocolate", 3) → "ChoChoCho"fron
tTimes("Abc", 3) → "AbcAbcAbc"*/

public String frontTimes(String str, int n) {
  
  String s="";
  
  if(str.length()<4)
  {
    for(int i=0;i<n;i++)
    {
      s+=str;
    }
    return s;
  }
  String front= str.substring(0,3);
  for(int i=0;i<n;i++)
  {
    s+=front;
  }
  return s;
}
