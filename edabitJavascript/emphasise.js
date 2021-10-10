function emphasise(str) {
  return str.length
    ? str
        .toLowerCase()
        .split(" ")
        .map((word) => word[0].toUpperCase() + word.substr(1))
        .join(" ")
    : str;
}
