/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in t
he array. Return true if the array does not contain any triples.noTriples([1, 1, 2, 2, 1])
 → truenoTriples([1, 1, 2, 2, 2, 1]) → falsenoTriples([1, 1, 1, 2, 2, 2, 1]) → false*/

public boolean noTriples(int[] nums) {
  int count=0;
  for(int i=0;i<nums.length-2;i++)
  {
    
    if(nums[i]==nums[i+1]&&nums[i]==nums[i+2])
    {
      return false;
    }
    
    
  }
  
  return true;
}
