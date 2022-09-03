function spotlightSum(n) {
  let sum = 0;
  if (n % 10 == 1) {
    sum =
      n +
      1 +
      (n + 1 - 10) +
      (n + 1 + 10) +
      (n - 10 < 0 ? n : n - 10) +
      (n + 10 > 100 ? n : n + 10) +
      n;
  } else if (n % 10 == 0) {
    sum =
      n -
      1 +
      (n - 1 - 10) +
      (n - 1 + 10) +
      (n - 10 < 0 ? n : n - 10) +
      (n + 10 > 100 ? n : n + 10) +
      n;
  } else {
    sum =
      n +
      1 +
      (n + 1 + 10) +
      (n + 1 - 10) +
      (n - 1) +
      (n - 1 + 10) +
      (n - 1 - 10) +
      (n + 10) +
      (n - 10) +
      n;
  }
  return sum;
}
