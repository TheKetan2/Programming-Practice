function getDiscounts(nums, d) {
  let percent = Number(d.replace("%", ""));
  return nums.map((num) => num * (percent / 100));
}
