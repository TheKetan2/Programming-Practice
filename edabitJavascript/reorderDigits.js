function reorderDigits(arr, direction) {
  return arr.map((num) =>
    Number(
      num
        .toString()
        .split("")
        .map((n) => Number(n))
        .sort((a, b) => (direction == "asc" ? a - b : b - a))
        .join("")
    )
  );
}
