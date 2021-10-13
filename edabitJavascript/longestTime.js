function longestTime(h, m, s) {
  let time = Object.entries({ [h]: h * 60 * 60, [m]: m * 60, [s]: s }).sort(
    (a, b) => b[1] - a[1]
  );
  return parseInt(time[0][0]);
}
