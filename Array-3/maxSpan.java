/*Consider the leftmost and righmost appearances of some value in an array. We'll say that t
he "span" is the number of elements between the two inclusive. A single value has a span o
f 1. Returns the largest span found in the given array. (Efficiency is not a priority.)max
Span([1, 2, 1, 1, 3]) → 4maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6maxSpan([1, 4, 2, 1, 4, 4, 4]) 
→ 6*/

public int maxSpan(int[] nums) {
	int maxSpan = 0;
	for(int i=0; i<nums.length; i++){
		for(int j=nums.length -1; j > -1; j--){
			if(nums[i] == nums[j]){
				if((j-i+1) > maxSpan) maxSpan = (j-i+1);
			}
		}
	}
	return maxSpan;
}
