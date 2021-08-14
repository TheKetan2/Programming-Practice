function pentagonal(num) {
  let sum = 1;
  sum += 5 * (num - 1);
  for (let i = 3; i <= num; i++) {
    sum += 5 * (i - 2);
  }
  return sum;
}
