function isPalindromePossible(str) {
  let chars = {};
  for (let char of [...str]) {
    if (chars[char]) {
      chars[char] += 1;
    } else {
      chars[char] = 1;
    }
  }
  if (str.length % 2 == 0) {
    let arr = Object.values(chars).filter((val) => val % 2 == 1);
    //console.log("even", chars);
    if (arr.length === 0) {
      return true;
    } else {
      return false;
    }
  } else {
    //console.log("odd", chars);
    let arr = Object.values(chars).filter((val) => val % 2 == 1);
    if (arr.length === 1) {
      return true;
    } else {
      return false;
    }
  }
}
