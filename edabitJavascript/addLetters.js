function addLetters(a) {
  let alpha = "zabcdefghijklmnopqrstuvwxyz";
  let index = 0;
  for (let ch of a) {
    index += alpha.indexOf(ch);
  }
  if (index > alpha.length) {
    index = (index % alpha.length) + 1;
  }
  return alpha[index];
}
