/*Return the sum of the numbers in the array, except ignore sections of numbers starting wit
h a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 f
or no numbers.sum67([1, 2, 2]) → 5sum67([1, 2, 2, 6, 99, 99, 7]) → 5sum67([1, 1, 6, 7, 2])
 → 4*/

public int sum67(int[] nums) {
	int sum = 0;
	boolean ignore = false;
  for (int i=0; i<nums.length; i++) {
  	if(!ignore && !(nums[i] == 6)) sum += nums[i];
  	else if(nums[i] == 6) ignore = true;
  	else if(nums[i] == 7) ignore = false;
  }
  return sum;
}