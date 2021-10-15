function reversedBinaryInteger(num) {
  let bin = num.toString(2).split("").reverse().join("");
  return parseInt(bin, 2);
}
