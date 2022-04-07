function sumCubes(n) {
  let sol = 0;
  for (let i = 1; i <= n; i++) {
    sol += Math.pow(i, 3);
  }
  return sol;
}
