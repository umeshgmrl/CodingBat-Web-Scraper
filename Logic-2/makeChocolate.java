/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and bi
g bars (5 kilos each). Return the number of small bars to use, assuming we always use big 
bars before small bars. Return -1 if it can't be done.makeChocolate(4, 1, 9) → 4makeChocol
ate(4, 1, 10) → -1makeChocolate(4, 1, 7) → 2*/

public int makeChocolate(int small, int big, int goal) {
  int count=0;
 for(int i=1;i<=big;i++)
 {
   if(5*i<=goal)
   {
     count= count+5;
   }
 }
 int k= goal-count;
 if(k>small) return -1;
 return k;
}
