function multiplicationTable(n) {
  let sol = [];
  for (let i = 1; i <= n; i++) {
    let temp = Array.from({ length: n }, () => i);
    temp = temp.map((num, i) => num * (i + 1));
    sol.push(temp);
  }
  return sol;
}
