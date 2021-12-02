function countLoneOnes(n) {
  let arr = n
    .toString()
    .split("")
    .map((n) => Number(n));
  arr.push(0);
  arr.unshift(0);
  let sol = 0;
  for (let i = 1; i < arr.length - 1; i++) {
    if (arr[i] == 1) {
      if (arr[i] !== arr[i - 1] && arr[i] !== arr[i + 1]) {
        sol++;
      }
    }
  }
  return sol;
}
