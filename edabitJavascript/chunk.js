function chunk(array, size) {
  let sol = [];
  while (array.length) {
    sol.push(array.splice(0, size));
  }
  return sol;
}
