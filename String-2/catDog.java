/*Return true if the string "cat" and "dog" appear the same number of times in the given str
ing.catDog("catdog") → truecatDog("catcat") → falsecatDog("1cat1cadodog") → true*/

public boolean catDog(String str) {
  int c=0;
  int d=0;
  for(int i=0;i<str.length()-2;i++)
  {
    if(str.substring(i,i+3).equals("cat")) c++;
    if(str.substring(i,i+3).equals("dog")) d++;
  }
  if(c==d) return true;
  return false;
}
