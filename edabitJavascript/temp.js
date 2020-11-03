const mixMiddle = (str) => {
  let strArr = str.split(" ").map((word) => {
    if (word.length <= 3) return word;
    else {
      return (
        word[0] +
        [...word.substr(1, word.length - 2)].reverse().join("") +
        word[word.length - 1]
      );
    }
  });
  return strArr;
};

console.log(mixMiddle("the quick brown fox jumps high"));
