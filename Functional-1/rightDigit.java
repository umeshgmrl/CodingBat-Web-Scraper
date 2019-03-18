/*Given a list of non-negative integers, return an integer list of the rightmost digits. (No
te: use %)rightDigit([1, 22, 93]) → [1, 2, 3]rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8,
 1]rightDigit([10, 0]) → [0, 0]*/

public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n -> (n%10));
  return nums;
}
