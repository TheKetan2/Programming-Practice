function findHighest(arr) {
  let max = -9999;

  for (let num of arr) {
    if (num > max) {
      max = num;
    }
  }

  return max;
}
