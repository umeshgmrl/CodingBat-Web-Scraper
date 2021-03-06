/*Given an array length 1 or more of ints, return the difference between the largest and sma
llest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) method
s  return the smaller or larger of two values.bigDiff([10, 3, 5, 6]) → 7bigDiff([7, 2, 10,
 9]) → 8bigDiff([2, 10, 7, 2]) → 8*/

public int bigDiff(int[] nums) {
  int smallest = nums[0];
  int biggest = nums[0];
  for(int i=0; i<nums.length; i++){
    if(nums[i] < smallest) smallest = nums[i];
    if(nums[i] > biggest) biggest = nums[i];
  }
  return biggest - smallest;
}
