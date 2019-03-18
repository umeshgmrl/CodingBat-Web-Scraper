/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.either24([1, 2, 2]) → trueeither24([4, 4, 1]) → trueeither24([4, 4, 1, 2, 2]) → false*/

		public boolean either24(int[] nums) {
	if(nums.length < 2) return false;
	boolean twosPair = false;
	boolean foursPair = false;
  for (int i=0; i<nums.length-1; i++) {
  	if(nums[i] == 2 && nums[i+1] == 2) twosPair = true;
  	if(nums[i] == 4 && nums[i+1] == 4) foursPair = true;
  }

  if(twosPair != foursPair) return true;
  return false;
}

		