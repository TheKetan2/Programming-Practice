function evenOddString(txt) {
  let sol = ["", ""];
  for (let i = 0; i < txt.length; i++) {
    if (i % 2 == 0) {
      sol[0] += txt[i];
    } else {
      sol[1] += txt[i];
    }
  }
  return sol.join(" ");
}
