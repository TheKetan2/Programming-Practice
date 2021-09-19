function trace(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i][i];
  }
  return sum;
}

function trace2(arr) {
  return arr.reduce((acc, curr, i) => (acc += curr[i]), 0);
}
