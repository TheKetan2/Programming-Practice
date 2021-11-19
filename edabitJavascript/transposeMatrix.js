function transposeMatrix(mtx) {
  let sol = "";
  while (mtx[0].length) {
    for (let arr of mtx) {
      sol += " " + arr.shift();
    }
  }
  return sol.trim();
}
