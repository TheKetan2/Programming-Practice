/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 * github: theketan2
 * @param {*} steps
 * @param {*} path
 */
function countingValleys(steps, path) {
  // Write your code here
  let seaLevel = 0;
  let arr = [];
  let temp = [];
  for (let ch of [...path]) {
    if (ch === "U") {
      seaLevel += 1;
      arr.push(seaLevel);
    } else if (ch === "D") {
      seaLevel -= 1;
      arr.push(seaLevel);
    }
    if (!temp.length && seaLevel <= 0) {
      temp.push(seaLevel);
    } else if (temp[temp.length - 1] === 0 && seaLevel < 0) {
      temp.push(seaLevel);
    } else if (temp[temp.length - 1] < 0 && seaLevel === 0) {
      temp.push(seaLevel);
    }
  }

  if (temp.length === 0) return 0;
  let ans = temp.filter((t) => t !== 0).length;
  return ans;
}
