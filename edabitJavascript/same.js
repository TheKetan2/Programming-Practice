function same(a1, a2) {
  let setA1 = new Set(a1);
  let setA2 = new Set(a2);
  return setA1.size === setA2.size;
}
