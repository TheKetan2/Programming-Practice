function getSentenceValue(str) {
  str = str.replace(/[^a-zA-Z ]/g, "");
  let alpha = " abcdefghijklmnopqrstuvwxyz";
  let sol = 0;
  for (let word of str.split(" ")) {
    let temp = 0;
    for (let char of [...word]) {
      temp += alpha.indexOf(char.toLowerCase());
    }
    if (word.toUpperCase() === word) {
      sol += 2 * temp;
    } else {
      sol += temp;
    }
  }
  return sol;
}
