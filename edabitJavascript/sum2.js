const num = {
  1: 1,
  2: 2,
  3: 3,
  4: 4,
  5: 5,
  6: 6,
  7: 7,
  8: 8,
  9: 9,
  0: 0,
  undefined: 0,
};
function sum2(a, b) {
  let numA = [...a];
  let numB = [...b];
  let sol = "";
  let carry = 0;
  while (numA.length || numB.length) {
    let tempA = num[numA.pop()];
    let tempB = num[numB.pop()];
    let sum = tempA + tempB + carry;
    if (sum > 9) {
      carry = Math.floor(sum / 10);
      sol = (sum % 10) + sol;
    } else {
      sol = sum + sol;
      carry = 0;
    }
    //console.log(`${tempA} + ${tempB}+${carry} = ${sum}, ${sol}`,carry)
  }
  return carry ? carry + sol : sol;
}
