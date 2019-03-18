/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.modThree([2, 1, 3, 5]) → truemodThree([2, 1, 2, 5]) → falsemodThree([2, 4, 2, 5]) → true*/

		public boolean modThree(int[] nums) {
  for (int i=0; i<nums.length; i++) {
  	if(i+2 < nums.length){
  		if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) return true;
  		if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0) return true;
  	}
  }
  return false;
}
		