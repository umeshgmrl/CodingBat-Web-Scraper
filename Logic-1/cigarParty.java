/*When squirrels get together for a party, they like to have cigars. A squirrel party is suc
cessful when the number of cigars is between 40 and 60, inclusive. Unless it is the weeken
d, in which case there is no upper bound on the number of cigars. Return true if the party
 with the given values is successful, or false otherwise.cigarParty(30, false) → falseciga
rParty(50, false) → truecigarParty(70, true) → true*/

public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend) return cigars>39;
  else return cigars>39&&cigars<61;
}
