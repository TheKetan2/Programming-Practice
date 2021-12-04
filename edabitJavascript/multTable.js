function multTable(n) {
  let sol = [];
  for (let i = 1; i <= n; i++) {
    let temp = Array.from({ length: n }, () => i);
    sol.push(temp.map((n, i) => n * (i + 1)));
  }
  return sol;
}
