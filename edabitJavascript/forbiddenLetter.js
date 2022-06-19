function forbiddenLetter(char, arr) {
  return arr.filter((word) => word.includes(char)).length == 0;
}
