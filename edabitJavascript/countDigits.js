function countDigits(n, d) {
  let sol = 0;
  for (let i = 0; i <= n; i++) {
    let temp = i * i;
    if (temp == 0 && d == 0) {
      sol++;
    }
    while (temp) {
      if (d == temp % 10) {
        sol++;
      }
      temp = Math.floor(temp / 10);
    }
  }
  return sol;
}
