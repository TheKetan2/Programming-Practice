function pieChart(data) {
  let totalSlices = Object.values(data).reduce((acc, curr) => acc + curr);
  for (let key of Object.keys(data)) {
    data[key] = parseFloat(((data[key] * 360) / totalSlices).toFixed(1));
  }
  return data;
}
