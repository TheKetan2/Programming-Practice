//1st solution
function histogram(arr, char) {
  let sol = [];
  for (let num of arr) {
    let word = Array.from({ length: num }, () => char);
    sol.push(word.join(""));
  }
  return sol.join("\n");
}

//2nd solution
function histogram2(arr, char) {
  return arr
    .map((num) => Array.from({ length: num }, () => char).join(""))
    .join("\n");
}
