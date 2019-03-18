/*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will 
be length 0, 1, or 2.double23([2, 2]) → truedouble23([3, 3]) → truedouble23([2, 3]) → fals
e*/

public boolean double23(int[] nums) {
  if(nums.length<2) return false;
  if((nums[0]==2&&nums[1]==2)||(nums[0]==3&&nums[1]==3)) return true;
  return false;
}
