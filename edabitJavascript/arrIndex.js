function arrIndex(arr, idx) {
  let flat = arr.flat();
  let sol = "";
  for (i of idx) {
    sol += flat[i - 1];
  }
  return sol;
}
