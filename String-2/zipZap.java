/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and en
ding with 'p'. Return a string where for all such words, the middle letter is gone, so "zi
pXzap" yields "zpXzp".zipZap("zipXzap") → "zpXzp"zipZap("zopzop") → "zpzp"zipZap("zzzopzop
") → "zzzpzp"*/

public String zipZap(String str) {
  for(int i=0; i<str.length()-2; i++){
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
      str = str.substring(0, i) +"z"+ str.substring(i+2);
    }
  }
  return str;
}
