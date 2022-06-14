function justAnotherSumProblem(a, b) {
  let sol = 0;
  for (let i = Math.min(a, b); i <= Math.max(a, b); i++) {
    sol += i;
  }
  return sol;
}
