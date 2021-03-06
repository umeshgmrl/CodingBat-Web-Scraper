/*Given a string, return a string where every appearance of the lowercase word "is" has been
 replaced with "is not". The word "is" should not be immediately preceeded or followed by 
a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(ch
ar) tests if a char is a letter.)notReplace("is test") → "is not test"notReplace("is-is") 
→ "is not-is not"notReplace("This is right") → "This is not right"*/

public String notReplace(String str) {
	str = " " + str + " ";
  for(int i=1; i<str.length()-1; i++){
  	if(str.substring(i, i+2).equals("is") && !Character.isLetter(str.charAt(i+2)) && !Character.isLetter(str.charAt(i-1))){
  		str = str.substring(0, i+2) + " not" + str.substring(i+2);
  	}
  }
  return str.trim();
}
