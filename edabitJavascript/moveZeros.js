function moveZeros(arr) {
  let sol = arr.filter((num) => num !== 0);
  return [...sol, ...Array.from({ length: arr.length - sol.length }, () => 0)];
}
