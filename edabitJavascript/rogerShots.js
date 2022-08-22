function rogerShots(arr) {
  arr = arr
    .map((a) => {
      let w = a.replace("!", "").split("Bang");
      w.pop();
      return w;
    })
    .filter((a) => a.includes(""));
  console.log(arr);
  let sol = 0,
    shots = 0;
  for (let a of arr) {
    if (shots < 6) {
      sol += 0.5;
      shots += a.length;
    } else {
      return sol;
    }
  }
  return sol;
}
