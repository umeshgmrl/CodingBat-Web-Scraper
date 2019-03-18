/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.maxBlock("hoopla") → 2maxBlock("abbCCCddBBBxx") → 3maxBlock("") → 0*/

		public int maxBlock(String str) {
	if(str.length() < 1) return 0;
  int maxBlockLength = 1;
  int currentStreak = 1;
  for(int i=0; i<str.length()-1; i++){
  	if(str.charAt(i) == str.charAt(i+1)){
  		currentStreak++;
  	} else {
  		currentStreak = 1;
  	}
  	if(currentStreak > maxBlockLength) maxBlockLength = currentStreak;
  }
  return maxBlockLength;
}

		