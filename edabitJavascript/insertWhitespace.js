function insertWhitespace(s) {
  let sol = "";
  for (let i = 0; i < s.length; i++) {
    if (s[i] >= "A" && s[i] <= "Z") {
      sol += " " + s[i];
    } else {
      sol += s[i];
    }
  }
  return sol.trim();
}
