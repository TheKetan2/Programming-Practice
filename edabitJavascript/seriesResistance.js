function seriesResistance(arr) {
  let resistance = arr.reduce((acc, curr) => acc + curr, 0);
  return resistance > 1 ? resistance + " ohms" : resistance + " ohm";
}
