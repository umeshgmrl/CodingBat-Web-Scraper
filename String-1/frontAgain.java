/*Given a string, return true if the first 2 chars in the string also appear at the end of t
he string, such as with "edited".frontAgain("edited") → truefrontAgain("edit") → falsefron
tAgain("ed") → true*/

public boolean frontAgain(String str) {
 if(str.length()<2) return false;
 String front= str.substring(0,2);
 String back= str.substring(str.length()-2);
 return (front.equals(back));
}
