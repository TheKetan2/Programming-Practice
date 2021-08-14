function sentence(words) {
  let sol = "";
  let len = words.length - 1;
  words.forEach((item, i) => {
    let isVowel = "aeiouAEIOU".includes(item[0]);
    if (i == 0) {
      sol += isVowel ? `An ${item}` : `A ${item}`;
    } else if (i === len) {
      sol += isVowel ? ` and an ${item}.` : ` and a ${item}.`;
    } else {
      sol += isVowel ? `, an ${item}` : `, a ${item}`;
    }
  });
  //  console.log(sol)
  return sol;
}
