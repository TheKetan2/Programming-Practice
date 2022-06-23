function stringPairs(str) {
  let sol = [];
  let strArr = [...str];
  while (strArr.length) {
    sol.push(strArr.splice(0, 2).join(""));
  }
  //console.log(sol);
  return sol.map((word) => (word.length == 1 ? word + "*" : word));
}
