function switchGravityOn(arr) {
  let gravity = [];
  let sol = [];
  for (let i = 0; i < arr[0].length; i++) {
    let temp = [];
    for (let j = 0; j < arr.length; j++) {
      if (arr[j][i] === "#") {
        temp.push(arr[j][i]);
      } else {
        temp.unshift(arr[j][i]);
      }
    }
    gravity.push(temp);
  }
  for (let i = 0; i < gravity[0].length; i++) {
    let temp = [];
    for (let j = 0; j < gravity.length; j++) {
      temp.push(gravity[j][i]);
    }
    sol.push(temp);
  }
  return sol;
}
