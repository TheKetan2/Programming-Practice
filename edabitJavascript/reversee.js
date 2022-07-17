function reverse(str) {
  return str
    .split(" ")
    .reverse()
    .map((word) => word.split("").reverse().join(""))
    .join(" ");
}
