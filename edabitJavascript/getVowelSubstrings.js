function getVowelSubstrings(str) {
  let sol = strArr(str);
  //console.log(sol)
  return sol.filter((word) => {
    let len = word.length - 1;
    return "aeiou".includes(word[0]) && "aeiou".includes(word[len]);
  });
}

function getConsonantSubstrings(str) {
  let sol = strArr(str);
  //console.log(sol)
  return sol.filter((word) => {
    let len = word.length - 1;
    return !"aeiou".includes(word[0]) && !"aeiou".includes(word[len]);
  });
}

function strArr(str) {
  let sol = [];
  let len = str.length;
  for (let i = 0; i < len; i++) {
    for (let j = 1; j <= len - i; j++) {
      sol.push(str.substr(i, j));
    }
  }
  sol.sort();
  return [...new Set(sol)];
}
