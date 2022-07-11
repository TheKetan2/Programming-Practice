function multiSum(num, ten = 10) {
  return Array.from({ length: ten }, () => 0).reduce(
    (acc, curr, i) => acc + num * (i + 1),
    0
  );
}
