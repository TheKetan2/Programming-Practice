function editWords(arr) {
  let sol = [];
  for (let word of arr) {
    word = word.toUpperCase().split("").reverse().join("");
    let len = Math.ceil(word.length / 2);
    sol.push(word.substr(0, len) + "-" + word.substr(len));
  }
  return sol;
}
