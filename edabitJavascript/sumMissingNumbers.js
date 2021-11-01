function sumMissingNumbers(arr) {
  let min = Math.min(...arr);
  let max = Math.max(...arr);
  let sum = 0;
  for (let i = min; i < max; i++) {
    if (!arr.includes(i)) {
      sum += i;
    }
  }
  return sum;
}
