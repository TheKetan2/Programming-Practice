function battingAvg(arr) {
  return (
    arr.reduce((acc, curr) => acc + curr[0], 0) /
    arr.reduce((acc, curr) => acc + curr[1], 0)
  )
    .toFixed(3)
    .substr(1);
}
