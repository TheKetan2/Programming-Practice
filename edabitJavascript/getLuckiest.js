function getLuckiest(arr) {
  if (arr.length == 0) {
    return null;
  }
  let obj = {};
  let max = 0;
  for (let num of arr) {
    let occurances =
      num.toString().length - num.toString().replace(/[5]/g, "").length;
    obj[num] = occurances;
    max = Math.max(max, occurances);
  }
  if (max === 0) {
    return arr[0];
  }
  let objEntries = Object.entries(obj)
    .filter((entry) => entry[1] == max)
    .sort((a, b) => b[0] - a[0]);
  console.log(objEntries);
  return Number(objEntries[0][0]);
}
