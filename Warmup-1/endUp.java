/*Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.endUp("Hello") → "HeLLO"endUp("hi there") → "hi thERE"endUp("hi") → "HI"*/

		public String endUp(String str) {
  if(str.length()<3)
  {
    String s;
    s= str.toUpperCase();
    return s;
  }
  String front, back;
  front= str.substring(0,str.length()-3);
  back= str.substring(str.length()-3);
  String backup= back.toUpperCase();
  return front+backup;
}

		