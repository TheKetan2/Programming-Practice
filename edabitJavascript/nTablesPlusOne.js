function nTablesPlusOne(n) {
  return Array.from({ length: 10 }, (_, i) => (i + 1) * n + 1).join(",");
}
