/**
 * https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/stones-piles/problem
 * github: theketan2
 * @param {*} arr
 */

function maximumStones(arr) {
  // Write your code here
  return (
    2 *
    Math.min(
      arr.filter((n, i) => i % 2 == 0).reduce((a, b) => a + b, 0),
      arr.filter((n, i) => i % 2 !== 0).reduce((a, b) => a + b, 0)
    )
  );
}
