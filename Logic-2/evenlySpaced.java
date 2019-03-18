/*Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.evenlySpaced(2, 4, 6) → trueevenlySpaced(4, 6, 2) → trueevenlySpaced(4, 6, 3) → false*/

		public boolean evenlySpaced(int a, int b, int c) {
 
  int temp=0;
  int[] arr={a,b,c};
  int n = arr.length;  
  
  for(int i=0; i < n; i++){  
      for(int j=1; j < (n-i); j++)
      {  
          if(arr[j-1] > arr[j])
          {  
               //swap elements  
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
               arr[j] = temp;  
          }  
                          
     }  

}
 if(arr[1]-arr[0]==arr[2]-arr[1]) return true;
 return false;
}

		