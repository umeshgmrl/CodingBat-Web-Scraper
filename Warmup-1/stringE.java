/*Return true if the given string contains between 1 and 3 'e' chars.stringE("Hello") → truestringE("Heelle") → truestringE("Heelele") → false*/

		public boolean stringE(String str) {
  
  if(str.length()<1) return false;
  int a= str.length();
  String b= str.replace("e","");
  int c= b.length();
  int count= a-c;
  if(count>0&&count<4)
  {
    return true;
  }
  return false;
}

		