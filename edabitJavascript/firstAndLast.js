function firstAndLast(s) {
  let arr = [...s].sort();
  return [arr.join(""), arr.reverse().join("")];
}
