/*A sandwich is two pieces of bread with something in between. Return the string that is bet
ween the first and last appearance of "bread" in the given string, or return the empty str
ing "" if there are not two pieces of bread.getSandwich("breadjambread") → "jam"getSandwic
h("xxbreadjambreadyy") → "jam"getSandwich("xxbreadyy") → ""*/

public String getSandwich(String str) {
  int a= str.indexOf("bread");
  int b= str.lastIndexOf("bread");
  if(a+4<b){
    return str.substring(a+5,b);
  }
  return "";
}
