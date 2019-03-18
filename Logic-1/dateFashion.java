/*You and your date are trying to get a table at a restaurant. The parameter "you" is the st
ylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date'
s clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=y
es. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exce
ption that if either of you has style of 2 or less, then the result is 0 (no). Otherwise t
he result is 1 (maybe).dateFashion(5, 10) → 2dateFashion(5, 2) → 0dateFashion(5, 5) → 1*/

public int dateFashion(int you, int date) {
  if((you>=8||date>=8)&&(you>2&&date>2))
  {
    return 2;
  }
   if(you<3||date<3)
   {
     return 0;
   }
  return 1;
}
