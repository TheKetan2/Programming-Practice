function mode(nums) {
  let obj = {};
  let max = 0;
  for (let num of nums) {
    if (obj[num]) {
      obj[num] += 1;
    } else {
      obj[num] = 1;
    }
    if (max < obj[num]) {
      max = obj[num];
    }
  }
  //console.log(obj)
  return Object.keys(obj)
    .map((key) => parseInt(key))
    .filter((key) => obj[key] === max)
    .sort((a, b) => parseInt(a) - parseInt(b));
}
