function findDifference(a, b) {
  return Math.abs(
    a.reduce((acc, curr) => acc * curr, 1) -
      b.reduce((acc, curr) => acc * curr, 1)
  );
}
