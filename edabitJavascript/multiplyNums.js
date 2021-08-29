function multiplyNums(nums) {
  return nums.split(",").reduce((acc, curr) => (acc *= parseInt(curr)), 1);
}
