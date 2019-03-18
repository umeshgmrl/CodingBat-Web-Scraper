/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.withoutEnd("Hello") → "ell"withoutEnd("java") → "av"withoutEnd("coding") → "odin"*/

		public String withoutEnd(String str) {
  
  String s="";
  if(str.length()<2) return s;
  return str.substring(1,str.length()-1);
  
}

		