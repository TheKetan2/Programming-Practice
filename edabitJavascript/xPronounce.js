function xPronounce(sentence) {
  let arr = sentence.split(" ").map((word) => {
    if (word.length == 1 && word == "x") {
      return "ecks";
    } else if (word[0] == "x") {
      word = "z" + word.slice(1);
    }
    return word.replace(/[x]/g, "cks");
  });
  return arr.join(" ");
}
