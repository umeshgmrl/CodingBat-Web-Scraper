/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true 
if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.u
nlucky1([1, 3, 4, 5]) → trueunlucky1([2, 1, 3, 4, 5]) → trueunlucky1([1, 1, 1]) → false*/

public boolean unlucky1(int[] nums) {
  if(nums.length<2) return false;
   if(nums.length==2)
   {
     if(nums[0]==1&&nums[1]==3) return true;
   }
  
  for(int i=0;i<2;i++)
  {
    if(nums[i]==1&&nums[i+1]==3) return true;
  }
    if(nums[nums.length-2]==1&&nums[nums.length-1]==3) return true;
    return false;
  
}
