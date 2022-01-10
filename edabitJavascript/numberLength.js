function numberLength(num) {
  return BigInt(num).toString() == "10000000000000000"
    ? BigInt(num).toString().length - 1
    : BigInt(num).toString().length;
}
