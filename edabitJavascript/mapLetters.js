function mapLetters(word) {
  let sol = {};
  for (let i = 0; i < word.length; i++) {
    if (sol[word[i]]) {
      sol[word[i]].push(i);
    } else {
      sol[word[i]] = [i];
    }
  }
  return sol;
}
