/*Given a string and an int n, return a string made of the first n characters of the string,
 followed by the first n-1 characters of the string, and so on. You may assume that n is b
etween 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).repea
tFront("Chocolate", 4) → "ChocChoChC"repeatFront("Chocolate", 3) → "ChoChC"repeatFront("Ic
e Cream", 2) → "IcI"*/

public String repeatFront(String str, int n) {
  String temp= "";
  for(int i=n; i>-1; i--){
    temp+= str.substring(0,i);
  }
  return temp;
}
