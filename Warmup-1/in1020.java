/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.in1020(
12, 99) → truein1020(21, 12) → truein1020(8, 99) → false*/

public boolean in1020(int a, int b) {
 
 return ((a>9&&a<21)||(b>9&&b<21));
}
