/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, a
nd no 3's are next to each other.haveThree([3, 1, 3, 1, 3]) → truehaveThree([3, 1, 3, 3]) 
→ falsehaveThree([3, 4, 3, 3, 4]) → false*/

public boolean haveThree(int[] nums) {
	int threeCount = 0;
  for (int i=0; i<nums.length; i++) {
  	if(nums[i] == 3){
  		boolean left = true;
  		boolean right = true;
  		if(i-1 > -1 && nums[i-1] == 3){
  				left = false;
  		}
  		if(i+1 < nums.length && nums[i+1] == 3){
  				right = false;
  		}
  		if(left && right) threeCount++;
  	}
  }
  return threeCount == 3;
}