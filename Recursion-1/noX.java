/*Given a string, compute recursively a new string where all the 'x' chars have been removed
.noX("xaxb") → "ab"noX("abc") → "abc"noX("xx") → ""*/

public String noX(String str) {
  if (str.equals("")) return str;
	if (str.substring(0, 1).equals("x")) return noX(str.substring(1));
	return str.charAt(0) + noX(str.substring(1));
}
