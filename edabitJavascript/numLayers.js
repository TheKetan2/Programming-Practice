function numLayers(n) {
  let thikness = 0.5;
  console.log(n);
  while (n) {
    thikness *= 2;
    n--;
  }
  return `${thikness / 1000}m`;
}
