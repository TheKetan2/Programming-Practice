function hasIdentical(arr) {
  let row = arr.map((a) => a.join(","));
  for (let i = 0; i < arr.length; i++) {
    let temp = [];
    for (let j = 0; j < arr.length; j++) {
      temp.push(arr[j][i]);
    }
    if (row.includes(temp.join(","))) return true;
  }
  return false;
}
