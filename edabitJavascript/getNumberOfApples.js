function getNumberOfApples(n, p) {
  let finished = n * (parseInt(p) / 100);
  let remaining = Math.floor(n - finished);
  return remaining ? remaining : "The children didn't get any apples";
}
