function distanceHome(arr) {
  return Math.abs(arr.reduce((acc, curr) => acc + curr, 0));
}
