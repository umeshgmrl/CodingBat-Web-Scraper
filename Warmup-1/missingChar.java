/*Given a non-empty string and an int n, return a new string where the char at index n has b
een removed. The value of n will be a valid index of a char in the original string (i.e. n
 will be in the range 0..str.length()-1 inclusive).missingChar("kitten", 1) → "ktten"missi
ngChar("kitten", 0) → "itten"missingChar("kitten", 4) → "kittn"*/

public String missingChar(String str, int n) {
  

   String front= str.substring(0,n);
   String back= str.substring(n+1,str.length());
   
   /*char c= str.charAt(n);
   String str1= str.replace(c,"");
   return str1;*/
  
  return front+back;
}
