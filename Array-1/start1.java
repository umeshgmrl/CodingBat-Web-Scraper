/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as t
heir first element.start1([1, 2, 3], [1, 3]) → 2start1([7, 2, 3], [1]) → 1start1([1, 2], [
]) → 1*/

public int start1(int[] a, int[] b) {
  int count = 0;
  if (a.length != 0) {
     if (a[0]== 1) count++; }
  if (b.length != 0) {
     if (b[0]== 1) count++; }
     
     return count;
}
