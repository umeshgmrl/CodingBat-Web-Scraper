/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.diff21(19) → 2diff21(10) → 11diff21(21) → 0*/

		public int diff21(int n) {
  if(n<21) return (21-n);
  else return 2*(n-21);
}

		