/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the st
ring.countX("xxhixx") → 4countX("xhixhix") → 3countX("hi") → 0*/

public int countX(String str) {
  if(str.length()==0) return 0;
  if(str.length() == 1 && str.charAt(0) == 'x') return 1;
  if(str.length() == 1 && str.charAt(0) != 'x') return 0;
  if(str.charAt(0)=='x') return 1 + countX(str.substring(1));
  return countX(str.substring(1));
}
