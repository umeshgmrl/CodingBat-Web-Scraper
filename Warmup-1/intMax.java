/*Given three int values, a b c, return the largest.intMax(1, 2, 3) → 3intMax(1, 3, 2) → 3in
tMax(3, 2, 1) → 3*/

public int intMax(int a, int b, int c) {
  if(a>b&&a>c) return a;
  else if(b>a&&b>c) return b;
  else if(c>a&&c>b) return c;
  return 0;
}
