function combinations(...items) {
  let sol = 1;
  for (let num of items) {
    if (num > 0) {
      sol *= num;
    }
  }
  return sol;
}
