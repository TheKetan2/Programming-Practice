function sumArray(arr) {
  return arr.flat(Infinity).reduce((acc, curr) => acc + curr, 0);
}
