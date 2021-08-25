function spoonerise(phrase) {
  let [w1, w2] = phrase.split(" ");
  let i = 0;
  while (!"aeiou".includes(w1[i])) {
    i++;
  }
  let [prew1, postw1] = [w1.substr(0, i), w1.substr(i)];
  i = 0;
  while (!"aeiou".includes(w2[i])) {
    i++;
  }
  let [prew2, postw2] = [w2.substr(0, i), w2.substr(i)];
  return prew2 + postw1 + " " + prew1 + postw2;
}
