function secretPassword(message) {
  let alpha = [
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
  ];
  if (
    message.replace(/[^a-z]/g, "").toLowerCase() === message &&
    message.length === 9
  ) {
    let word = [];
    for (let i = 0; i < 9; i += 3) {
      word.push(message.substr(i, 3).split(""));
    }
    console.log(word);
    word[0] = [
      alpha.indexOf(word[0][0]) + 1,
      word[0][1],
      alpha.indexOf(word[0][2]) + 1,
    ];

    word[1] = [word[1][2], word[1][1], word[1][0]];

    word[2] = [
      alpha[(alpha.indexOf(word[2][0]) + 1) % 26],
      alpha[(alpha.indexOf(word[2][1]) + 1) % 26],
      alpha[(alpha.indexOf(word[2][2]) + 1) % 26],
    ];

    let sol = [word[1], word[2], word[0]].map((w) => w.join("")).join("");
    //console.log(sol);
    return sol;
  } else {
    return "BANG! BANG! BANG!";
  }
}
