function challenge1(s) {
  return s.slice(0, 5);
}

function challenge2(s) {
  return s.slice(s.length - 5);
}

function challenge3(s) {
  return s.slice(0).split("").reverse().join("");
}

function challenge4(s) {
  return s.slice(0, 6).split("").reverse().join("");
}

function challenge5(s) {
  let sol = "";
  for (let i = 1; i < s.length; i += 2) {
    sol += s[i];
  }
  s = sol;
  return s.slice(sol.length - 4);
}
