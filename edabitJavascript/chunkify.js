function chunkify(arr, size) {
  let sol = [];
  while (arr.length) {
    let temp = [];
    let len = size;
    while (len--) {
      if (!arr.length) break;
      temp.push(arr.shift());
    }
    sol.push(temp);
  }
  return sol;
}

function chunkify(arr, size) {
  let sol = [];
  while (arr.length) {
    sol.push(arr.splice(0, size));
  }
  return sol;
}
