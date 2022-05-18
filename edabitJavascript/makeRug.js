function makeRug(m, n, s = "#") {
  let line = Array.from({ length: n }, () => s).join("");
  return Array.from({ length: m }, () => line);
}
