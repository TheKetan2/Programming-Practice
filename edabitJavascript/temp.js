function minLength(arr, n) {
  let sol = arr.length;
  let found = false;
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j <= arr.length; j++) {
      let sumInRange = arr.slice(i, j).reduce((acc, curr) => acc + curr);
      if (sumInRange > n) {
        found = true;
        if (arr.slice(i, j).length < sol) {
          sol = arr.slice(i, j).length;
        }
      }
    }
  }
  return found ? sol : -1;
}
