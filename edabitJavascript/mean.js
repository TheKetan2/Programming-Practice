function mean(nums) {
  return Number(
    (nums.reduce((acc, curr) => acc + curr, 0) / nums.length).toFixed(1)
  );
}
