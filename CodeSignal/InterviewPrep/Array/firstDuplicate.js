function solution(a) {
  let obj = {};
  for (let num of a) {
    if (obj[num]) {
      return num;
    } else {
      obj[num] = 1;
    }
  }
  return -1;
}
