// https://edabit.com/challenge/8QTBwLzAdaM8wkrXu
function balanced(word) {
  let len = word.length;
  let wordArr = [...word],
    word1 = 0,
    word2 = 0;
  let half = Math.round(len / 2);
  const alpha = "abcdefghijklmnopqrstuvwxyz";
  while (wordArr.length > 1) {
    word1 += alpha.indexOf(wordArr.shift());
    word2 += alpha.indexOf(wordArr.pop());
  }
  return word1 === word2;
}
