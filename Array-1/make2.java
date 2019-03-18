/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
the elements from a followed by the elements from b. The arrays may be any length, includi
ng 0, but there will be 2 or more elements available between the 2 arrays.make2([4, 5], [1
, 2, 3]) → [4, 5]make2([4], [1, 2, 3]) → [4, 1]make2([], [1, 2]) → [1, 2]*/

public int[] make2(int[] a, int[] b) {
  int[] arr= new int[2];
  int count=0;
  if(a.length==1)
  {
    arr[count]=a[0];
    count++;
  }
  if(a.length>=2)
  {
    arr[count]=a[0];
    count++;
    arr[count]=a[1];
    return arr;
  
  }
  if(b.length==1)
  {
    arr[count]=b[0];
    count++;
    if(count==2)
    {
      return arr;
    }
  }
  if(b.length>=2)
  {
     arr[count]=b[0];count++;
      if(count==2)
    {
      return arr;
    }
    arr[count]=b[1];
  }
   return arr;
}
