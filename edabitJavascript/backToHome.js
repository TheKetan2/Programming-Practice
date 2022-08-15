function backToHome(directions) {
  let n = 0,
    s = 0,
    e = 0,
    w = 0;
  for (let d of [...directions]) {
    if (d == "N") {
      n += 1;
      s -= 1;
    } else if (d == "S") {
      s += 1;
      n--;
    } else if (d == "E") {
      e++;
      w--;
    } else {
      w++;
      e--;
    }
  }
  //   console.log(n, s, e, w);
  return [n, s, e, w].every((d) => d == 0);
}
