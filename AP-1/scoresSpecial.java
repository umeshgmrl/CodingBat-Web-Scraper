/*Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a
 multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the la
rgest special score in B. To practice decomposition, write a separate helper method which 
finds the largest special score in an array. Write your helper method after your scoresSpe
cial() method in the JavaBat text area.scoresSpecial([12, 10, 4], [2, 20, 30]) → 40scoresS
pecial([20, 10, 4], [2, 20, 10]) → 40scoresSpecial([12, 11, 4], [2, 20, 31]) → 20*/

public int scoresSpecial(int[] a, int[] b) {
  int first = special(a);
  int second = special(b);
  return first + second;
}
public int special(int[] arr){
	int result = 0;
	for (int i=0; i<arr.length; i++) {
		if( arr[i]>result && arr[i]%10 == 0 ){
			result = arr[i];
		}
	}
	return result;
}
