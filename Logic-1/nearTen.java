/*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to ModnearTen(12) → truenearTen(17) → falsenearTen(19) → true*/

		public boolean nearTen(int num) {
  if(num%10<3||num%10>7) return true;
  return false;
}

		