/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the arra
y somewhere.array123([1, 1, 2, 3, 1]) → truearray123([1, 1, 2, 4, 1]) → falsearray123([1, 
1, 2, 1, 2, 3]) → true*/

public boolean array123(int[] nums) {
  
 for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}
