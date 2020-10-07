/**https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 * GitHub: theketan2
 * @param {*} year
 */

function dayOfProgrammer(year) {
  if (year === 1800 || year === 1900 || year === 1700) return "12.09." + year;
  if (year === 1918) return "26.09." + year;
  let leap = new Date(year, 1, 29).getDate() === 29;
  console.log(year + " : " + leap);
  return leap === true ? "12.09." + year : "13.09." + year;
}
