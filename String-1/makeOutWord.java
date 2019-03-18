/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.makeOutWord("<<>>", "Yay") → "<<Yay>>"makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"makeOutWord("[[]]", "word") → "[[word]]"*/

		public String makeOutWord(String out, String word) {
  
  int k= out.length()/2;
  String front= out.substring(0,k);
  String back= out.substring(k,out.length());
  return front+word+back;
}

		