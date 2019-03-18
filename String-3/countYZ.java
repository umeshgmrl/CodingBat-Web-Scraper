/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)countYZ("fez day") → 2countYZ("day fez") → 2countYZ("day fyyyz") → 2*/

		public int countYZ(String str) {
  int count =0;

  for(int i=0; i< str.length() -1 ; i++){
  	if(checkMatch(str.charAt(i)) && checkMatch(str.charAt(i)) && !Character.isLetter(str.charAt(i+1))){
    	count++;
  	}
  }
  if(checkMatch(str.charAt(str.length()-1)) || checkMatch(str.charAt(str.length()-1))){
    count++;
  }
  return count;
}

public boolean checkMatch(char character){
	 return Character.toLowerCase(character) == 'y' || Character.toLowerCase(character) == 'z';
}

		