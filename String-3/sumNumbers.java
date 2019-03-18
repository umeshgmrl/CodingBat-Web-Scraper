/*Given a string, return the sum of the numbers appearing in the string, ignoring all other 
characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDig
it(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) co
nverts a string to an int.)sumNumbers("abc123xyz") → 123sumNumbers("aa11b33") → 44sumNumbe
rs("7 11") → 18*/

public int sumNumbers(String str) {
  int result = 0;
  String buffer = "0";
  for(int i=0; i<str.length(); i++){
  	char ch = str.charAt(i);
  	if(Character.isDigit(ch)){
  			buffer +=  ch;
  	} else {
  			result += Integer.parseInt(buffer);
  			buffer = "0";
  	}
  }
  result += Integer.parseInt(buffer);
  return result;
}

