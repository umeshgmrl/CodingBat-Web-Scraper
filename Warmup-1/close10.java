/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.close10(8, 13) → 8close10(13, 8) → 8close10(13, 7) → 0*/

		public int close10(int a, int b) {
  
  int i= Math.abs(a-10);
  int k= Math.abs(b-10);
  if(i==k) return 0;
  if(i<k)
  {
    return a;
  }
  if(k<i)
  {
    return b;
  }
  return 0;
  
}

		