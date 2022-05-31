function sumMinimums(arr) {
  return arr.map((a) => Math.min(...a)).reduce((acc, curr) => acc + curr, 0);
}
