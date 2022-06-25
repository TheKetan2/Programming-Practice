function evenLast(arr) {
  if (arr.length == 0) return 0;
  let eveArr = arr
    .filter((_, i) => i % 2 == 0)
    .reduce((acc, curr) => acc + curr, 0);
  return eveArr * arr[arr.length - 1];
}
