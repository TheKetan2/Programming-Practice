function nextSquare(n) {
  let sqrt = Math.sqrt(n);
  if (sqrt === Math.round(sqrt)) {
    sqrt += 1;
    return sqrt * sqrt;
  }
  return null;
}
