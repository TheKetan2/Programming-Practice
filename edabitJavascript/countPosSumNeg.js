function countPosSumNeg(arr) {
  let positive = 0;
  let negSum = 0;
  for (let num of arr) {
    if (num >= 0) {
      positive++;
    } else {
      negSum += num;
    }
  }
  return arr.length ? [positive, negSum] : [];
}
