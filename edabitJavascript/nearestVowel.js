function nearestVowel(s) {
  let obj = { a: 99, e: 99, i: 99, o: 99, u: 99 };
  let min = 99;
  let sol = "";
  for (let char of [..."aeiou"]) {
    let diff = Math.abs(char.charCodeAt(0) - s.charCodeAt(0));
    if (diff < min) {
      min = diff;
      sol = char;
    }
  }
  return sol;
}
