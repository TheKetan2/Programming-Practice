function elasticize(word) {
  let len = word.length;
  let half = Math.floor(len / 2);
  let left = word.substr(0, Math.floor(len / 2));
  let right = word.substr(len % 2 == 0 ? half : half + 1);
  let solLeft = "";
  let solRight = "";
  for (let i = 0, j = half - 1; i < half; i++, j--) {
    solLeft += Array.from({ length: i + 1 }, () => left[i]).join("");
    solRight += Array.from({ length: j + 1 }, () => right[i]).join("");
  }
  let center =
    len % 2 == 0
      ? ""
      : Array.from({ length: half + 1 }, () => word[half]).join("");
  //console.log(solLeft,center, solRight)
  return solLeft + center + solRight;
}
