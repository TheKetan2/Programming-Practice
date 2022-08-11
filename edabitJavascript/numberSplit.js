function numberSplit(n) {
  return n % 2 == 0
    ? [n / 2, n / 2]
    : [Math.floor(n / 2), Math.floor(n / 2) + 1];
}
