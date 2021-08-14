function pluralize(arr) {
  let obj = {};
  for (let item of arr) {
    if (obj[item]) {
      obj[item] += 1;
    } else {
      obj[item] = 1;
    }
  }
  return Object.keys(obj).map((key) => (obj[key] > 1 ? `${key}s` : key));
}
