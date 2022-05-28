function removeNumbers(str) {
  return str
    .split("")
    .filter((c) => isNaN(Number(c)))
    .join("");
}
