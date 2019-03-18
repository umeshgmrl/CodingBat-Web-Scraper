/*Given start and end numbers, return a new array containing the sequence of integers from s
tart up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end nu
mber will be greater or equal to the start number. Note that a length-0 array is valid. (S
ee also: FizzBuzz Code)fizzArray3(5, 10) → [5, 6, 7, 8, 9]fizzArray3(11, 18) → [11, 12, 13
, 14, 15, 16, 17]fizzArray3(1, 3) → [1, 2]*/

public int[] fizzArray3(int start, int end) {
  int arrayLength = end-start;
	int[] resultArray =  new int[arrayLength];
	for (int i=0; i<arrayLength; i++) {
		resultArray[i] = start++;
	}
	return resultArray;
}
