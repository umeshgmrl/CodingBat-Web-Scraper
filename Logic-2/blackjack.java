/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going o
ver. Return 0 if they both go over.blackjack(19, 21) → 21blackjack(21, 19) → 21blackjack(1
9, 22) → 19*/

public int blackjack(int a, int b) {
 if(a>21) a=0;
 if(b>21) b=0;
 if(a>b) return a;
 return b;
  }
