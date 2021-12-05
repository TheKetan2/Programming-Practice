function mostExpensive(obj) {
  let objArr = Object.entries(obj).sort((a, b) => b[1] - a[1]);
  return `The most expensive one is the ${objArr[0][0]}`;
}
