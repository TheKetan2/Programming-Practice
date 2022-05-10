function divisibleByB(a, b) {
  let [min, max] = [Math.min(a, b), Math.max(a, b)];
  for (let i = max; ; i++) {
    if (i % min == 0) {
      return i;
    }
  }
}
