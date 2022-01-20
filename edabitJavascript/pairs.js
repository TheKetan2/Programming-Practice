function pairs(arr) {
  let sol = [];
  while (arr.length) {
    if (arr.length == 1) {
      let num = arr.pop();
      sol.push([num, num]);
    } else {
      sol.push([arr.shift(), arr.pop()]);
    }
  }
  return sol;
}
