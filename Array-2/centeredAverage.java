/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.centeredAverage([1, 2, 3, 4, 100]) → 3centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5centeredAverage([-10, -4, -2, -4, -2, 0]) → -3*/

		public int centeredAverage(int[] nums) {
  int indexOfSmallest = 0;
  int indexOfBiggest = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] < nums[indexOfSmallest]) indexOfSmallest = i;
    if(nums[i] > nums[indexOfBiggest]) indexOfBiggest = i;
  }
  nums[indexOfSmallest] = 0;
  nums[indexOfBiggest] = 0;
  int arraySum = 0;
  for(int i=0; i<nums.length; i++){
    arraySum += nums[i];
  }
  return arraySum/(nums.length-2);
}

		