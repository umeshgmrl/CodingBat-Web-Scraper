/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.twoTwo([4, 2, 2, 3]) → truetwoTwo([2, 2, 4]) → truetwoTwo([2, 2, 4, 2]) → false*/

		public boolean twoTwo(int[] nums) {
  if(nums.length == 1 && nums[0] == 2){
  	return false;
  }
	for (int i=0; i<nums.length; i++) {
  	if(nums[i] == 2){
  		boolean left = false;
  		boolean right = false;
  		if(i-1 > -1 && nums[i-1] == 2){
  				left = true;
  		}
  		if(i+1 < nums.length && nums[i+1] == 2){
  				right = true;
  		}
  		if(!(left || right)) return false;
  	}
	}
	return true;
}
		