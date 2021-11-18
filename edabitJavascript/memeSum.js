function memeSum(a, b) {
  let aArr = a
    .toString()
    .split("")
    .map((n) => Number(n));
  let bArr = b
    .toString()
    .split("")
    .map((n) => Number(n));
  let sol = [];
  console.log(aArr, bArr);
  while (aArr.length > 0 || bArr.length > 0) {
    let numOne = aArr.pop();
    let numTwo = bArr.pop();
    numOne = numOne == undefined ? 0 : numOne;
    numTwo = numTwo === undefined ? 0 : numTwo;
    sol.push(numOne + numTwo);
  }
  return parseInt(sol.reverse().join(""));
}
