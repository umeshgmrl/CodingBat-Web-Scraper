/*Return a version of the given string, where for every star (*) in the string the star and 
the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" 
also yields "ad".starOut("ab*cd") → "ad"starOut("ab**cd") → "ad"starOut("sm*eilly") → "sil
ly"*/

public String starOut(String str) {
  for(int i=0; i<str.length()-2; i++){
    if(str.charAt(i) == '*'){
    }
  }
  return str;
}
