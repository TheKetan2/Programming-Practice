function happinessNumber(s) {
  let score = {
    ":)": 0,
    "(:": 0,
    ":(": 0,
    "):": 0,
  };
  for (let i = 0; i < s.length - 1; i++) {
    score[s[i] + s[i + 1]] += 1;
  }
  //   console.log(score[":)"] + score["(:"]);
  //   console.log(score[":("] + score["):"]);
  return score[":)"] + score["(:"] - (score[":("] + score["):"]);
}
