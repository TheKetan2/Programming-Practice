function split(str) {
  let b = [str[0]];
  let index = [0];
  let sol = [];
  for (let i = 1; i < str.length; i++) {
    let len = b.length - 1;
    if (str[i] == ")" && b[len] == "(") {
      b.pop();
      if (b.length == 0) {
        // console.log(i);
        index.push(i);
      }
    } else {
      b.push(str[i]);
    }
  }
  for (let i = 1; i < index.length; i++) {
    sol.push(
      str.substr(
        i == 1 ? 0 : index[i - 1] + 1,
        i == 1 ? index[i] - index[i - 1] + 1 : index[i] - index[i - 1]
      )
    );
  }
  return sol;
}
