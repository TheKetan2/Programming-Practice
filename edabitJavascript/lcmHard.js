function lcm(nums) {
  let max = Math.max(...nums);
  let len = nums.length,
    tempMax = max;
  while (true) {
    let temp = nums.filter((num) => tempMax % num == 0);
    if (temp.length === len) {
      return tempMax;
    }
    tempMax += max;
  }
}
