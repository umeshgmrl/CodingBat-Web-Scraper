/*Return true if the given string contains a "bob" string, but where the middle 'o' char can
 be any char.bobThere("abcbob") → truebobThere("b9b") → truebobThere("bac") → false*/

public boolean bobThere(String str) {
  for(int i=0; i+2<str.length(); i++){
    if(str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b")) return true;
  }
  return false;
}
