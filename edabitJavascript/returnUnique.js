function returnUnique(arr) {
  let sol = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr.lastIndexOf(arr[i]) === arr.indexOf(arr[i])) {
      sol.push(arr[i]);
    }
  }
  return sol;
}
