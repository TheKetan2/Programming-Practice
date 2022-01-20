function invert(s) {
  return s
    .split("")
    .reverse()
    .map((ch) => (ch.toUpperCase() == ch ? ch.toLowerCase() : ch.toUpperCase()))
    .join("");
}
