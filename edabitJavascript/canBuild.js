function canBuild(digits, arr) {
  for (let num of arr) {
    for (let n of [...num.toString()]) {
      if (digits[n] === 0) {
        return false;
      } else {
        digits[n] -= 1;
      }
    }
  }
  return true;
}
