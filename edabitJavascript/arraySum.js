function arraySum(nums) {
  return Number(
    nums
      .reduce(
        (acc, curr) =>
          curr % 2 == 0 ? curr * curr + acc : Math.pow(curr, 0.5) + acc,
        0
      )
      .toFixed(2)
  );
}
