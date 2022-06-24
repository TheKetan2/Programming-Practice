function arrayLessThan100(arr) {
  return arr.reduce((acc, curr) => acc + curr, 0) < 100;
}
