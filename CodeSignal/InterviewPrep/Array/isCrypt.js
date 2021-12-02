function solution(crypt, solution) {
  let solObj = {};
  for (let sol of solution) {
    solObj[sol[0]] = sol[1];
  }
  let cryptWords = [];
  for (let word of crypt) {
    let temp = "";
    for (let ch of word) {
      temp += solObj[ch];
    }
    cryptWords.push(temp);
  }
  console.log(cryptWords);
  let [num1, num2, num3] = cryptWords.map((n) => Number(n));
  let [len1, len2, len3] = cryptWords.map((n) => n.length);
  if (len1 === 1 && len2 === 1 && len3 === 1) {
    return num1 + num2 === 0;
  }
  if (
    cryptWords[0][0] !== "0" &&
    cryptWords[1][0] !== "0" &&
    cryptWords[2][0] !== "0"
  ) {
    return num1 + num2 === num3;
  }
  return false;
}
