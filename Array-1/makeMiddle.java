/*Given an array of ints of even length, return a new array length 2 containing the middle t
wo elements from the original array. The original array will be length 2 or more.makeMiddl
e([1, 2, 3, 4]) → [2, 3]makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]makeMiddle([1, 2]) → [1, 2]*/

public int[] makeMiddle(int[] nums) {
  int[] newNums= new int[2];
  if(nums.length==2) return nums;
  int index= nums.length/2-1;
  newNums[0]= nums[index];
  newNums[1]= nums[index+1];
  return newNums;
  
}
