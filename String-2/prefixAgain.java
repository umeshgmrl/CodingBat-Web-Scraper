/*Given a string, consider the prefix string made of the first N chars of the string. Does t
hat prefix string appear somewhere else in the string? Assume that the string is not empty
 and that N is in the range 1..str.length().prefixAgain("abXYabc", 1) → trueprefixAgain("a
bXYabc", 2) → trueprefixAgain("abXYabc", 3) → false*/

public boolean prefixAgain(String str, int n) {
  String temp= str.substring(0,n);
  return (str.lastIndexOf(temp)>=n);
}
