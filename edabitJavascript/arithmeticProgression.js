function arithmeticProgression(start, diff, n) {
  let sol = [start];
  for (let i = 1; i < n; i++) {
    let temp = sol[sol.length - 1];
    sol.push(temp + diff);
  }
  return sol.join(", ");
}
