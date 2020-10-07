/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 * GitHub: theketan2
 * @param {*} year
 */

function pageCount(n, p) {
  /*
   * Write your code here.
   */
  let obj = {};
  let index = 0;
  let size = Math.floor(n / 2);
  for (let i = 0; i <= n; i += 2) {
    obj[i] = i + 1;
  }

  index = Object.keys(obj).includes(p + "")
    ? Object.keys(obj).indexOf(p + "")
    : Object.values(obj).indexOf(p);
  console.log(obj, index);
  return index <= Math.floor(size / 2) ? index : size - index;
}
