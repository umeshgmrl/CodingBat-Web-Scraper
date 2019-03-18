/*Given an int array length 2, return true if it contains a 2 or a 3.has23([2, 5]) → truehas
23([4, 3]) → truehas23([4, 5]) → false*/

public boolean has23(int[] nums) {
  return(nums[0]==2||nums[0]==3||nums[1]==3||nums[1]==2);
}
