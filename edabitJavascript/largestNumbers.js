function largestNumbers(n, arr) {
  arr.sort((a, b) => Number(a) - Number(b));
  return Array.from({ length: n }, () => arr.pop()).sort(
    (a, b) => Number(a) - Number(b)
  );
}
