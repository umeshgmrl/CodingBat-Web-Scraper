/*Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.in3050(30, 31) → truein3050(30, 41) → falsein3050(40, 50) → true*/

		public boolean in3050(int a, int b) {
  if((a>29&&a<41)&&(b>29&&b<41))
  {
    return true;
  }
   if((a>39&&a<51)&&(b>39&&b<51))
  {
    return true;
  }
  return false;
}

		