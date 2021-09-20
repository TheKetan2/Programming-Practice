function missingLetter(str) {
  let char = str[0].charCodeAt();
  for (let ch of [...str]) {
    if (String.fromCharCode(char) !== ch) {
      return String.fromCharCode(char);
    }
    char++;
  }
  return "No Missing Letter";
}
