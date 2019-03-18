/*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.hasOne(10) → truehasOne(22) → falsehasOne(220) → false*/

		public boolean hasOne(int n) {
  String s = String.valueOf(n);
  if(s.indexOf('1')>-1) return true;
  return false;
}
		