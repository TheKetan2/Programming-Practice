function duplicate(arr) {
  let obj = {};
  for (num of arr) {
    if (obj[num] === undefined) {
      obj[num] = 1;
    } else {
      obj[num] = obj[num] + 1;
    }
  }
  let sol = [];
  for (key of Object.keys(obj)) {
    if (obj[key] > 1) {
      sol.push(Number(key));
    }
  }
  return sol.sort((a, b) => a - b);
}
