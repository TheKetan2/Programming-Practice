function firstNonRepeatedCharacter(str) {
  let map = {};
  for (ch of [...str]) {
    if (map[ch] === undefined) {
      map[ch] = 1;
    } else {
      map[ch] += 1;
    }
  }

  for (key of Object.keys(map)) {
    if (map[key] === 1) {
      return key;
    }
  }
  return null;
}
