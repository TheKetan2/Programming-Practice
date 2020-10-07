/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 * Github: TheKetan2
 */
function migratoryBirds(arr) {
  let max = 0,
    sol;

  let obj = {};
  for (let num of arr) {
    if (obj[num] === undefined) {
      obj[num] = 1;
      if (obj[num] > max) {
        max = obj[num];
        sol = num;
      }
    } else {
      obj[num] = 1 + obj[num];
      if (obj[num] > max) {
        max = obj[num];
        sol = num;
      }
    }
  }
  console.log(obj);
  return sol;
}
