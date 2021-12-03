function colorPatternTimes(cols) {
  let arr = [cols[0]];
  for (let col of cols) {
    if (arr[arr.length - 1] !== col) arr.push(col);
  }
  return arr.length - 1 + cols.length * 2;
}
