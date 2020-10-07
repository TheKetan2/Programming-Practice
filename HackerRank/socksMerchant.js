/**https://www.hackerrank.com/challenges/sock-merchant/problem
 * GitHub: theketan2
 * @param {*} year
 */

function sockMerchant(n, ar) {
  let obj = {};
  let pair = 0;
  for (let num of ar) {
    if (obj[num] === undefined) obj[num] = 1;
    else obj[num] = obj[num] + 1;
  }
  for (let value of Object.values(obj)) {
    pair += Math.floor(value / 2);
  }
  return pair;
}
