function sumDigProd(...num) {
  let sum = num.reduce((acc, curr) => acc + curr, 0);
  //console.log(num,sum);
  while (sum > 10) {
    let temp = sum;
    let mult = 1;
    while (temp) {
      mult *= temp % 10;
      temp = Math.floor(temp / 10);
    }
    sum = mult;
  }
  return sum;
}
