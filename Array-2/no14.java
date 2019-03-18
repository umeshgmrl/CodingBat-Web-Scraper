/*Given an array of ints, return true if it contains no 1's or it contains no 4's.no14([1, 2
, 3]) → trueno14([1, 2, 3, 4]) → falseno14([2, 3, 4]) → true*/

public boolean no14(int[] nums) {
	boolean onePresent = false;
	boolean fourPresent = false;
  for (int i=0; i<nums.length; i++) {
  	if(nums[i] == 1) onePresent = true;
  	if(nums[i] == 4) fourPresent = true;
  }
  return !(onePresent && fourPresent);
}