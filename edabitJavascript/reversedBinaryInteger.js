function reversedBinaryInteger(num) {
  let binary = "";
  while (num) {
    binary += `${num % 2}`;
    num = Math.floor(num / 2);
  }
  return parseInt(binary, 2);
}
