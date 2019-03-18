/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.twoAsOne(1, 2, 3) → truetwoAsOne(3, 1, 2) → truetwoAsOne(3, 2, 2) → false*/

		public boolean twoAsOne(int a, int b, int c) {
  if(a==b+c||b==c+a||c==a+b) return true;
  return false;
}

		