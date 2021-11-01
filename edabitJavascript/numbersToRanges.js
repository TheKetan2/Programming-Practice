function numbersToRanges(arr) {
  let sol = [arr[0]];
  for (let i = 1; i < arr.length; i++) {
    let last = sol.pop();
    sol.push(last);
    if (arr[i] - last !== 1) {
      sol.push("#");
      sol.push(arr[i]);
    } else {
      sol.push(arr[i]);
    }
  }
  sol = sol
    .join(",")
    .split(",#,")
    .map((item) => item.split(","))
    .map((item) => {
      if (item.length === 1) {
        return item[0];
      } else {
        return item[0] + "-" + item.pop();
      }
    });
  console.log(sol);
  return sol.filter((item) => item !== "");
}
