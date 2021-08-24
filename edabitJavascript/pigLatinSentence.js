function pigLatinSentence(sentence) {
  let sol = sentence.split(" ").map((word) => {
    if ("aeiouAEIOU".includes(word[0])) {
      return word + "way";
    } else {
      let i = 0;
      while (!"aeiouAEIOU".includes(word[i])) {
        i++;
      }
      return word.substr(i) + word.substr(0, i) + "ay";
    }
  });
  return sol.join(" ");
}
