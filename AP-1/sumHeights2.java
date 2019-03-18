/*(A variation on the sumHeights problem.) We have an array of heights, representing the alt
itude along a walking trail. Given start/end indexes into the array, return the sum of the
 changes for a walk beginning at the start index and ending at the end index, however incr
eases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, e
nd=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into 
the array with start <= end.sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7sumHeights2([5, 3, 6, 7,
 2], 0, 1) → 2sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15*/

public int sumHeights2(int[] heights, int start, int end) {
	int result = 0;
	for (int i=start; i<end; i++) {
		if (heights[i+1]-heights[i]>=0) {
			result += (heights[i+1]-heights[i])*2;
		} else {
			result += Math.abs(heights[i]-heights[i+1]);
		}
	}
	return result;
}

