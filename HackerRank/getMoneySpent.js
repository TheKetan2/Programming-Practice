/**
 * Electronics Shop
 * @param {*} keyboards
 * @param {*} drives
 * @param {*} b
 */
function getMoneySpent(keyboards, drives, b) {
  /*
   * Write your code here.
   */
  let sol = -1;
  for (let key of keyboards) {
    for (let drive of drives) {
      let total = key + drive;
      if (total <= b && total > sol) {
        sol = total;
      }
    }
  }
  return sol;
}
