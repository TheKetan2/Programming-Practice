function modifyLast(str, n) {
  return (
    str +
    str
      .split("")
      .pop()
      .repeat(n - 1)
  );
}
