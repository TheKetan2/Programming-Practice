function replaceVowel(word) {
  let vow = " aeiou";
  let sol = "";
  for (let ch of word) {
    let idx = vow.indexOf(ch);
    if (idx === -1) {
      sol += ch;
    } else {
      sol += idx;
    }
  }
  return sol;
}
