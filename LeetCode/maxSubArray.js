/*53. Maximum Subarray
Easy

6039

254

Add to List

Share
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

var maxSubArray = function(nums) {
  if (nums.length === 1) return nums[0];
  let finalSum = nums[0];
  let currentSum = 0;
  let currentCompare = Math.max(...nums) > 0 ? 0 : Math.min(...nums);
  for (let num of nums) {
    currentSum = Math.max(currentCompare, currentSum + num);
    finalSum = Math.max(currentSum, finalSum);
  }
  return finalSum > Math.max(...nums) ? finalSum : Math.max(...nums);
};
