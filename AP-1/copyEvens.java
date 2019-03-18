/*Given an array of positive ints, return a new array of length "count" containing the first
 even numbers from the original array. The original array will contain at least "count" ev
en numbers.copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]*/

public int[] copyEvens(int[] nums, int count) {
	int[] result = new int[count];
	int index = 0;
	for (int i=0; i<nums.length; i++) {
		if(index >= count) continue;
		if (nums[i]%2 == 0) {
			result[index] = nums[i];
			index++;
		}
	}
	return result;
}
