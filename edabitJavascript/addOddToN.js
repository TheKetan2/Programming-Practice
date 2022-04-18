function addOddToN(n) {
  let sol = 0;
  for (let i = 0; i <= n; i++) {
    if (i % 2 !== 0) {
      sol += i;
    }
  }
  return sol;
}
