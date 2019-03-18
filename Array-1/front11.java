/*Given 2 int arrays, a and b, of any length, return a new array with the first element of e
ach array. If either array is length 0, ignore that array.front11([1, 2, 3], [7, 9, 8]) → 
[1, 7]front11([1], [2]) → [1, 2]front11([1, 7], []) → [1]*/

public int[] front11(int[] a, int[] b) {
  
  int count=0;
  int temp=0;
  if(a.length>0) count++;
  if(b.length>0) count++;
  
  int[] arr=new int[count];
  if(a.length>0)
  {
    arr[temp]=a[0];
    temp++;
  }
   if(b.length>0)
   {
     arr[temp]=b[0];
   }
   return arr;
}
