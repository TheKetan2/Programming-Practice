function dartsScoring(x, y) {
  let dist = Math.pow(x * x + y * y, 0.5);
  return dist <= 1 ? 10 : dist <= 5 ? 5 : dist <= 10 ? 1 : 0;
}
