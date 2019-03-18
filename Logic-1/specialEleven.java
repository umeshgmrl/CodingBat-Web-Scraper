/*We'll say a number is special if it is a multiple of 11 or if it is one more than a multip
le of 11. Return true if the given non-negative number is special. Use the % "mod" operato
r -- see Introduction to ModspecialEleven(22) → truespecialEleven(23) → truespecialEleven(
24) → false*/

public boolean specialEleven(int n) {
  if(n%11==0||n%11==1) return true;
  return false;
}
