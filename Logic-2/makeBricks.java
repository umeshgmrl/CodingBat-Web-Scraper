/*We want to make a row of bricks that is goal inches long. We have a number of small bricks
 (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the g
oal by choosing from the given bricks. This is a little harder than it looks and can be do
ne without any loops. See also: Introduction to MakeBricksmakeBricks(3, 1, 8) → truemakeBr
icks(3, 1, 9) → falsemakeBricks(3, 2, 10) → true*/

public boolean makeBricks(int small, int big, int goal) {
  if(goal> big*5+small) return false;
if(goal%5> small) return false;
return true;
}
