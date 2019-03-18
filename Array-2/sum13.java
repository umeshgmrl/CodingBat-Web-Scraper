/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.sum13([1, 2, 2, 1]) → 6sum13([1, 1]) → 2sum13([1, 2, 2, 1, 13]) → 6*/

		public int sum13(int[] nums) {
  if(nums.length <1) return 0;
	int sum =0;
  for (int i=1; i<nums.length; i++) {
  	if(nums[i-1] != 13 && nums[i] != 13) sum += nums[i];
  }
  if(nums[0] != 13) sum += nums[0];
  return sum;
}

		