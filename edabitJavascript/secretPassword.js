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
/**
 * 
 * Step 2: Divide the string into three equal parts of three characters each:

1 - mub
2 - ash
3 - irh
Step 3: Convert the first and third letter to the corresponding number, according to the English alphabets (ex. a = 1, b = 2, c = 3 ... z = 26, etc).

mub = 13u2
Step 4: Reverse the fourth, fifth, and sixth letters:

ash = hsa
Step 5: Replace seventh, eighth, and ninth letter with next letter (z will be substituted with a).

irh = jsi
Step 6: Return the string in the following order: "Part_2+Part_3+Part_1"

"hsajsi13u2"
 */
