/*Given an array of ints of odd length, look at the first, last, and middle values in the ar
ray and return the largest. The array length will be a least 1.maxTriple([1, 2, 3]) → 3max
Triple([1, 5, 3]) → 5maxTriple([5, 2, 3]) → 5*/

public int maxTriple(int[] nums) {
  if(nums.length==1) return nums[0];
  if(nums[0]>nums[nums.length/2]&&nums[0]>nums[nums.length-1]) return nums[0];
  if(nums[nums.length/2]>nums[0]&&nums[nums.length/2]>nums[nums.length-1]) return nums[nums.length/2];
  if(nums[nums.length-1]>nums[nums.length/2]&&nums[0]<nums[nums.length-1]) return nums[nums.length-1];
  return 0;
}
