function commonLastVowel(str) {
  return str
    .toLowerCase()
    .replace(/[^aeiou]/g, "")
    .split("")
    .pop();
}
