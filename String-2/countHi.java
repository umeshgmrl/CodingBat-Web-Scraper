/*Return the number of times that the string "hi" appears anywhere in the given string.count
Hi("abc hi ho") → 1countHi("ABChi hi") → 2countHi("hihi") → 2*/

public int countHi(String str) {
  int count=0;
  for(int i=0;i<str.length()-1;i++)
  {
    if(str.charAt(i)=='h'&&str.charAt(i+1)=='i')
    {
      count++;
    }
  }
  return count;
}
