function basicCalculator(a, o, b) {
  if (!"+-/*".includes(o)) {
    return null;
  }
  let sol = eval(`${a}${o}${b}`);
  return sol == Infinity ? null : sol;
}
