/*Given a string, return true if the number of appearances of "is" anywhere in the string is
 equal to the number of appearances of "not" anywhere in the string (case sensitive).equal
IsNot("This is not") → falseequalIsNot("This is notnot") → trueequalIsNot("noisxxnotyynotx
isi") → true*/

public boolean equalIsNot(String str) {
  int notCount = 0;
  int isCount = 0;
  for(int i=0; i< str.length()-2; i++){
    if(str.substring(i, i+3).equals("not")) notCount++;
  }
  for(int i=0; i< str.length()-1; i++){
    if(str.substring(i, i+2).equals("is")) isCount++; 
  }
  return notCount == isCount;
}
