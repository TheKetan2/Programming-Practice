function rotateMaxNumber(num) {
  return parseInt(
    num
      .toString()
      .split("")
      .map((n) => Number(n))
      .sort((a, b) => b - a)
      .join("")
  );
}
