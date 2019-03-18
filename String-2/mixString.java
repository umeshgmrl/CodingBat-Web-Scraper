/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.mixString("abc", "xyz") → "axbycz"mixString("Hi", "There") → "HTihere"mixString("xxxx", "There") → "xTxhxexre"*/

		public String mixString(String a, String b) {
  String sb= "";
  if(a.length()==0) return b;
  for(int i=0; i<a.length(); i++){
    sb+=a.substring(i,i+1);
    if(i<b.length()){
      sb+=b.substring(i,i+1);
    }
    if(i==a.length()-1&&b.length()>a.length()){
      sb+=b.substring(i+1);
    }
  }
  return sb;
}

		