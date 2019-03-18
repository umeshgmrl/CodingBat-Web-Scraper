/*Returns true if for every '*' (star) in the string, if there are chars both immediately be
fore and after the star, they are the same.sameStarChar("xy*yzz") → truesameStarChar("xy*z
zz") → falsesameStarChar("*xa*az") → true*/

public boolean sameStarChar(String str) {
  for(int i=1; i<str.length()-1; i++){
    if(str.charAt(i)=='*'&&str.charAt(i-1)!=str.charAt(i+1)) return false;
  }
  return true;
}
