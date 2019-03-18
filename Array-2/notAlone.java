/*We'll say that an element in an array is "alone" if there are values before and after it, 
and those values are different from it. Return a version of the given array where every in
stance of the given value which is alone is replaced by whichever value to its left or rig
ht is larger.notAlone([1, 2, 3], 2) → [1, 3, 3]notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3,
 5, 5, 2]notAlone([3, 4], 3) → [3, 4]*/

public int[] notAlone(int[] nums, int val) {
  for(int i=1; i< nums.length-1; i++){
  	if(nums[i] == val && nums[i-1] != val && nums[i+1] != val){
  		nums[i] = nums[i-1] > nums[i+1] ? nums[i-1] : nums[i+1];
  	}
  }
  return nums;
}