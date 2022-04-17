function reverse(str) {
  return [...str]
    .reverse()
    .map((ch) => (ch.toUpperCase() == ch ? ch.toLowerCase() : ch.toUpperCase()))
    .join("");
}
