/*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.xyzMiddle("AAxyzBB") → truexyzMiddle("AxyzBB") → truexyzMiddle("AxyzBBB") → false*/

		public boolean xyzMiddle(String str) {
  int i=0;
  while(str.indexOf("xyz",i)!=-1){
    i=str.indexOf("xyz",i);
    if(Math.abs(str.substring(0,i).length()-str.substring(i+3).length())<=1 ) return true;
    i++;
  }
  return false;
}

		