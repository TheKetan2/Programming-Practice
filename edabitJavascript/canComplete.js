function canComplete(initial, word) {
  let ini = initial.split("");
  for (let ch of [...word]) {
    if (ini.length && ini[0] === ch) {
      ini.shift();
    }
  }
  return ini.length ? false : true;
}
