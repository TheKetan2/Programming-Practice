function mod(a, b) {
  return a < b ? a : a - Math.floor(a / b) * b;
}
