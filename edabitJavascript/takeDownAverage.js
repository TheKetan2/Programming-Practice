function takeDownAverage(scores) {
  let total = scores.reduce((acc, curr) => parseInt(curr) + acc, 0);
  let avg = total / scores.length;
  let sol = (scores.length + 1) * (avg - 5) - total;
  return `${Math.round(sol)}%`;
}
