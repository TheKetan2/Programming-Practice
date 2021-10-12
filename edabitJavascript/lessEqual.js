function lessEqual(arr, k) {
  arr.sort((a, b) => a - b);
  let temp = arr.map((num) => arr.filter((n) => n <= num));
  for (let a of temp) {
    if (a.length == k) {
      return a.pop();
    }
  }
  if (k == 0 && arr.length == 1) {
    if (arr[0] == 1) return null;
    return 1;
  }
  return k == 0 ? 1 : null;
}
