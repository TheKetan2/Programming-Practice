function isIdentical(s) {
  let set = new Set([...s]);
  return set.size == 1;
}
