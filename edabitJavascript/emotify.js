function emotify(str) {
  let emotions = { smile: ":D", grin: ":)", sad: ":(", mad: ":P" };
  let sol = [];
  for (let word of str.split(" ")) {
    if (emotions[word]) {
      sol.push(emotions[word]);
    } else {
      sol.push(word);
    }
  }
  return sol.join(" ");
}

/**
smile	:D
grin	:)
sad	:(
mad	:P
*/
