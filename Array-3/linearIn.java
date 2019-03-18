/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all o
f the numbers in inner appear in outer. The best solution makes only a single "linear" pas
s of both arrays, taking advantage of the fact that both arrays are already in sorted orde
r.linearIn([1, 2, 4, 6], [2, 4]) → truelinearIn([1, 2, 4, 6], [2, 3, 4]) → falselinearIn([
1, 2, 4, 4, 6], [2, 4]) → true*/

public boolean linearIn(int[] outer, int[] inner) {
  Map<Integer, Boolean> map = new HashMap();
  for(int i=0; i<outer.length; i++){
  	map.put(outer[i], true);
  }
  for(int j=0; j<inner.length; j++){
  	if(!map.containsKey(inner[j])) return false;
  }
  return true;
}
