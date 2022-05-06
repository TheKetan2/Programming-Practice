function sumFive(arr) {
  return arr.filter((n) => n > 5).reduce((a, c) => a + c, 0);
}
