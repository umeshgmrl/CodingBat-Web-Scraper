/*Given a string, return a new string where the first and last chars have been exchanged.frontBack("code") → "eodc"frontBack("a") → "a"frontBack("ab") → "ba"*/

		public String frontBack(String str) {
  if(str.length()<=1) return str;
  else
  {
  char a= str.charAt(0);
  String b= str.substring(1,str.length()-1);
  char c= str.charAt(str.length()-1);
  return c+b+a;
  }
  
}

		