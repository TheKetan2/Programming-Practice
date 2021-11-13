function diamondArrays(x) {
  let sol = [];
  for (let i = 1; i <= x; i++) {
    sol.push(Array.from({ length: i }, () => i));
  }
  let temp = [...sol];
  temp.pop();
  return [...temp, ...sol.reverse()];
}
