/*The squirrels in Palo Alto spend most of the day playing. In particular, they play if the 
temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is
 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the sq
uirrels play and false otherwise.squirrelPlay(70, false) → truesquirrelPlay(95, false) → f
alsesquirrelPlay(95, true) → true*/

public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer)
  {
    if(temp>59&&temp<101) return true;
  }
  if(temp>59&&temp<91) return true;
  return false;
}
