function areaOfHexagon(x) {
  return x <= 0 ? null : Number(((3 * Math.sqrt(3) * x * x) / 2).toFixed(1));
}
