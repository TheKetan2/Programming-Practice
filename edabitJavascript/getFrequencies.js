function getFrequencies(arr) {
  let sol = {};
  for (let item of arr) {
    if (sol[item]) {
      sol[item] += 1;
    } else {
      sol[item] = 1;
    }
  }
  return sol;
}
