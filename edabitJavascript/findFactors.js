function findFactors(num) {
  let sol = [];
  for (let i = 1; i <= num; i++) {
    if (num % i == 0) {
      sol.push(i);
    }
  }
  return sol;
}
