function solution(a) {
  let sol = [];
  for (let i = 0; i < a.length; i++) {
    let temp = [];
    for (let j = 0; j < a.length; j++) {
      temp.push(a[j][i]);
    }
    sol.push(temp.reverse());
  }
  return sol;
}
