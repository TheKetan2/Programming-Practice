function filterArray(arr) {
  return arr
    .filter((item) => typeof item === "number")
    .filter((number) => Math.round(number) === number);
}
