/*You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all diffe
rent from each other, the result is 0. If all of the numbers are the same, the result is 2
0. If two of the numbers are the same, the result is 10.greenTicket(1, 2, 3) → 0greenTicke
t(2, 2, 2) → 20greenTicket(1, 1, 2) → 10*/

public int greenTicket(int a, int b, int c) {
  if(a!=b&&b!=c&&c!=a) return 0;
  if(a==b&&b==c) return 20;
  if(a==b||b==c||c==a) return 10;
  return 0;
}
