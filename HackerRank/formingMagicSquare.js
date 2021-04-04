function formingMagicSquare(s) {
  let mgcSqr = [
    [8, 3, 4],
    [1, 5, 9],
    [6, 7, 2],
  ];
  let sol = 0;
  for (let i = 0; i < mgcSqr.length; i++) {
    for (let j = 0; j < mgcSqr[0].length; j++) {
      if (mgcSqr[i][j] !== s[i][j]) {
        sol += Math.abs(mgcSqr[i][j] - s[i][j]);
      }
    }
  }
  return sol;
}
