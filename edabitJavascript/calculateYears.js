function calculateYears(humanYears) {
  let [h, c, d] = [humanYears, 0, 0];
  if (h > 2) {
    return [h, 24 + (h - 2) * 4, 24 + (h - 2) * 5];
  } else if (h == 2) {
    return [h, 24, 24];
  } else {
    return [h, 15, 15];
  }
}
