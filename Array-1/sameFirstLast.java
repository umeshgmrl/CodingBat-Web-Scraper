/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.sameFirstLast([1, 2, 3]) → falsesameFirstLast([1, 2, 3, 1]) → truesameFirstLast([1, 2, 1]) → true*/

		public boolean sameFirstLast(int[] nums) {
  if(nums.length>0&&nums[0]==nums[nums.length-1])
  {
    return true;
  }
  return false;
}

		