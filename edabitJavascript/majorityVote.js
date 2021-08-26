function majorityVote(arr) {
  let obj = {};
  if (!arr.length) {
    return null;
  }
  let set = new Set(arr);
  if (set.size === 1) {
    return arr[0];
  }
  for (let vote of arr) {
    if (obj[vote]) {
      obj[vote] += 1;
    } else {
      obj[vote] = 1;
    }
  }
  let sol = Object.entries(obj).sort((a, b) => b[1] - a[1]);
  return sol[0][1] == sol[sol.length - 1][1] ? null : sol[0][0];
}
