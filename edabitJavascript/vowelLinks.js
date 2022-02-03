function vowelLinks(str) {
  let strArr = str.toLowerCase().split(" ");
  for (let i = 1; i < strArr.length; i++) {
    let last = strArr[i - 1][strArr[i - 1].length - 1];
    let first = strArr[i][0];
    if ("aeiou".includes(last) && "aeiou".includes(first)) {
      return true;
    }
  }
  return false;
}
