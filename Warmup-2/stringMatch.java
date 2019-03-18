/*Given 2 strings, a and b, return the number of the positions where they contain the same l
ength 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" subs
trings appear in the same place in both strings.stringMatch("xxcaazz", "xxbaaz") → 3string
Match("abc", "abc") → 2stringMatch("abc", "axc") → 0*/

public int stringMatch(String a, String b) {
 
 int c= a.length();
 int d= b.length();
 int min=0;
 String temp1="";
 String temp2="";
 int count=0;
 
 if(c>d) min=d;
 else min=c;
 
 for(int i=0;i<min-1;i++)
 {
    temp1= a.substring(i,i+1)+a.substring(i+1,i+2);
    temp2= b.substring(i,i+1)+b.substring(i+1,i+2);
   if(temp1.equals(temp2))
   {
     count++;
   }
 }
  return count;
}
