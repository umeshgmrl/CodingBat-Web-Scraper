/*Given an array of ints, return true if the number of 1's is greater than the number of 4's
more14([1, 4, 1]) → truemore14([1, 4, 1, 4]) → falsemore14([1, 1]) → true*/

public boolean more14(int[] nums) {
	int onesCount = 0;
	int foursCount = 0;
  for (int i=0; i<nums.length; i++) {
  	if(nums[i] == 1) onesCount++;
  	if(nums[i] == 4) foursCount++;
  }
  return onesCount > foursCount;
}