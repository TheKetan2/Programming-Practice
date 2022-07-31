function minimumRemovals(arr) {
  return arr.reduce((acc, curr) => acc + curr, 0) % 2;
}
