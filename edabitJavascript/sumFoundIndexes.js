function sumFoundIndexes(arr, n) {
  let sol = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == n) {
      sol += i;
    }
  }
  return sol;
}
