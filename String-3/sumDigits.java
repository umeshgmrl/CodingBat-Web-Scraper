/*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all o
ther characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(c
har) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) conver
ts a string to an int.)sumDigits("aa1bc2d3") → 6sumDigits("aa11b33") → 8sumDigits("Chocola
te") → 0*/

public int sumDigits(String str) {
  int result = 0;
  for(int i=0; i<str.length(); i++){
    if(Character.isDigit(str.charAt(i))) result += Integer.parseInt(str.substring(i, i+1));
  }
  return result;
}
