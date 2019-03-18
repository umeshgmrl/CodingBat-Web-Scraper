/*Given a non-empty string like "Code" return a string like "CCoCodCode".stringSplosion("Code") → "CCoCodCode"stringSplosion("abc") → "aababc"stringSplosion("ab") → "aab"*/

		public String stringSplosion(String str) {
  
  int n= str.length();
  String s="";
  
  for(int i=0; i<n;i++)
  {
    String temp= str.substring(0,i+1);
    s+=temp;
  }
  return s;
}

		