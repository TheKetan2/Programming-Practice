function pyramidalString(string, type) {
  let sol = [];
  let str = string.split("");
  sol = helper(type === "REG" ? str : str.reverse(), type);
  if (sol.length >= 2) {
    if (type == "REG") {
      return sol[sol.length - 1].length > sol[sol.length - 2].length
        ? sol
        : "Error!";
    } else {
      return sol[0].length > sol[1].length ? sol : "Error!";
    }
  }
  return sol;
}
const helper = (str, type) => {
  let j = 1;
  let res = [];
  while (str.length) {
    let temp = [];
    for (let i = 0; i < j; i++) {
      temp.push(str.shift());
    }
    temp =
      type === "REG" ? temp.filter((t) => t) : temp.reverse().filter((t) => t);
    j++;
    res.push(temp.join(" "));
  }
  return type === "REG" ? res : res.reverse();
};
