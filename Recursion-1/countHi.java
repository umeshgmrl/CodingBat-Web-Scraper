/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears 
in the string.countHi("xxhixx") → 1countHi("xhixhix") → 2countHi("hi") → 1*/

public int countHi(String str) {
  if (str.length() < 2) return 0;
  if (str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(1));
  else return countHi(str.substring(1));
}