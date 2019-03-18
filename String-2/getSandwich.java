/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.getSandwich("breadjambread") → "jam"getSandwich("xxbreadjambreadyy") → "jam"getSandwich("xxbreadyy") → ""*/

		public String getSandwich(String str) {
  int a= str.indexOf("bread");
  int b= str.lastIndexOf("bread");
  if(a+4<b){
    return str.substring(a+5,b);
  }
  return "";
}

		