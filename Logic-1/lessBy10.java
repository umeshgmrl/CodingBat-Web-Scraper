/*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.lessBy10(1, 7, 11) → truelessBy10(1, 7, 10) → falselessBy10(11, 1, 7) → true*/

		public boolean lessBy10(int a, int b, int c) {
 // int x= Math.abs(a-b);
  //int y= Math.abs(b-c);
  //int z= Math.abs(c-a);
  
  if(a>b+9||a>c+9||b>c+9||b>a+9||c>a+9||c>b+9)
  {
    return true;
  }
  return false;
  
}

		