/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exist
s a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y
' can balance multiple 'x's. Return true if the given string is xy-balanced.xyBalance("aax
bby") → truexyBalance("aaxbb") → falsexyBalance("yaaxbb") → false*/

public boolean xyBalance(String str) {
  if(str.length()>1){
    int k=0;
    for(int i=0; i<str.length(); i++){
      if(str.substring(i,i+1).equals("x")){
        k=i;
      }
    }
    for(int j=k+1; j<str.length(); j++){
        if(str.substring(j,j+1).equals("y")) return true;
    }
  if(k==0) return true;
  return false;
  }
  return !str.equals("x");
}
