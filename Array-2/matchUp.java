/*Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the 
corresponding element in nums2 (at the same index). Return the count of the number of time
s that the two elements differ by 2 or less, but are not equal.matchUp([1, 2, 3], [2, 3, 1
0]) → 2matchUp([1, 2, 3], [2, 3, 5]) → 3matchUp([1, 2, 3], [2, 3, 3]) → 2*/

public int matchUp(int[] nums1, int[] nums2) {
	int count = 0;
  for (int i=0; i<nums1.length; i++) {
  	int diff = Math.abs(nums1[i] - nums2[i]);
  	if(diff < 3 && diff > 0) count++;
  }
  return count;
}
