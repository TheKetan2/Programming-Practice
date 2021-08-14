function equalize(arr, c) {
  let obj = {};
  let max = 0,
    sol = 0;
  for (let item of arr) {
    if (obj[item]) {
      obj[item] += 1;
    } else {
      obj[item] = 1;
    }
    if (max < obj[item]) {
      max = item;
    }
  }
  while (arr.length) {
    let temp = c;
    let flag = false;
    while (temp--) {
      if (arr.pop() !== max) {
        flag = true;
      }
    }
    if (flag) {
      sol++;
    }
  }
  return sol - 1;
}
