function repeat(str, n) {
  return [...str].map((ch) => ch.repeat(n)).join("");
}
