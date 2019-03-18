/*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Modold35(3) → trueold35(10) → trueold35(15) → false*/

		public boolean old35(int n) {
  int count=0;
  if(n%5==0) count++;
  if(n%3==0) count++;
  if(count==1) return true;
  
  return false;
}

		