/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.stringYak("yakpak") → "pak"stringYak("pakyak") → "pak"stringYak("yak123ya") → "123ya"*/

		public String stringYak(String str) {
  for(int i=0; i< str.length(); i++){
    int end = i+2 < str.length() ? i+2 : str.length() -1;
		if(str.charAt(i) == 'y' && str.charAt(end) == 'k'){
			str = str.substring(0, i) + str.substring(i+3);
		}
	}
	return str;
}


		