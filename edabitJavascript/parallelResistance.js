function parallelResistance(arr) {
  return parseFloat(
    (1 / arr.reduce((acc, curr) => (acc += 1 / curr), 0)).toFixed(1)
  );
}
