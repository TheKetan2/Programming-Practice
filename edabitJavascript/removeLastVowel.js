function removeLastVowel(str) {
  let strArr = str.split(" ");
  strArr = strArr.map((word) => {
    let sol = "",
      flag = false;
    for (let i = word.length - 1; i >= 0; i--) {
      if ("aeiouAEIOU".includes(word[i]) && !flag) {
        sol += "";
        flag = true;
      } else {
        sol += word[i];
      }
    }
    return sol.split("").reverse().join("");
  });
  return strArr.join(" ");
}
