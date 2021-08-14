function countNumberOfOccurrences(obj) {
  let values = Object.values(obj);
  let sol = {};
  for (let i = 0; i < values.length; i++) {
    let key = values[i];
    if (sol[key]) {
      sol[key] += 1;
    } else {
      sol[key] = 1;
    }
  }
  return sol;
}
