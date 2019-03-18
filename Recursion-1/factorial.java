/*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute
 the result recursively (without loops).factorial(1) → 1factorial(2) → 2factorial(3) → 6*/

public int factorial(int n) {
  if(n==0) return 1;
  return n*factorial(n-1);
}
