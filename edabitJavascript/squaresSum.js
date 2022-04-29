function squaresSum(n) {
  let sol = 0;
  for (let i = 1; i <= n; i++) {
    sol += i * i;
  }
  return sol;
}
