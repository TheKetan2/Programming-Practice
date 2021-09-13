function findBrokenKeys(str1, str2) {
  return [...new Set([...str1].filter((char, i) => str1[i] !== str2[i]))];
}
