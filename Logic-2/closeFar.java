/*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at m
ost 1), while the other is "far", differing from both other values by 2 or more. Note: Mat
h.abs(num) computes the absolute value of a number.closeFar(1, 2, 10) → truecloseFar(1, 2,
 3) → falsecloseFar(4, 1, 3) → true*/

public boolean closeFar(int a, int b, int c) {
 
  if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
      return true;
  } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
      return true;
  }else{
      return false;
  }
  
}