function getCase(str) {
  return str.toUpperCase() === str
    ? "upper"
    : str.toLowerCase() === str
    ? "lower"
    : "mixed";
}
