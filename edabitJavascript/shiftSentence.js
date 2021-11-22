function shiftSentence(str) {
  let strArr = str.split(" ");
  let firstLetter = strArr.map((w) => w[0]);
  for (let i = 1; i < strArr.length; i++) {
    strArr[i] = firstLetter[i - 1] + strArr[i].substr(1);
  }
  strArr[0] = firstLetter[firstLetter.length - 1] + strArr[0].substr(1);
  return strArr.join(" ");
}
