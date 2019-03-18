/*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.canBalance([1, 1, 1, 2, 1]) → truecanBalance([2, 1, 1, 2, 1]) → falsecanBalance([10, 10]) → true*/

		public boolean canBalance(int[] nums) {
	int leftSum = 0;
  int rightSum = 0;
  for(int i=1; i<nums.length; i++){
  	for(int j=0; j<i; j++){
  		leftSum += nums[j];
  	}
  	for(int h=i; h< nums.length; h++){
  		rightSum += nums[h];
  	}
  	if(leftSum == rightSum) return true;
  	leftSum = 0;
  	rightSum = 0;
  }
  return false;
}

		