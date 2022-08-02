function millionsRounding(arr) {
  return arr.map((a) => {
    a[1] = Math.round(a[1] / 1000000) * 1000000;
    return a;
  });
}
