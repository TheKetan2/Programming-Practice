function isBoiling(temp) {
  let t = parseInt(temp);
  return temp.includes("F") ? t >= 212 : t >= 100;
}
