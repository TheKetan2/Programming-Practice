function otherSides(length) {
  return [
    length * 2,
    Number(Math.sqrt((length * 2) ** 2 - length ** 2).toFixed(2)),
  ];
}
