function duplicateNums(nums) {
  nums.sort((a, b) => a - b);
  let obj = {};
  let sol = [];
  for (let i of nums) {
    if (!obj[i]) {
      obj[i] = 1;
    } else {
      obj[i] += 1;
      if (!sol.includes(i)) {
        sol.push(i);
      }
    }
  }
  return sol.length ? sol : null;
}
