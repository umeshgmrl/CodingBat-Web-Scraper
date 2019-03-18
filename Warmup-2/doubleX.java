/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".doubleX("axxbb") → truedoubleX("axaxax") → falsedoubleX("xxxxx") → true*/

		boolean doubleX(String str) {
  int count;
  boolean flag= false;
  for(int i=0;i<str.length()-1;i++)
  {
    if(str.charAt(i)=='x'&&flag==false)
    {
      if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')
      {
        flag= true;
        return flag;
      }
      return false;
      
    }
  }
  return false;
}

		