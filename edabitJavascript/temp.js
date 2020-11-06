let segment = [
  "",
  "want",
  "to",
  "capitalize",
  "the",
  "second",
  "word",
  "in",
  "t",
  "array",
];

let capSecond = segment.map((word, index) =>
  index % 2 !== 0 ? word[0].toUpperCase() + word.substr(1) : word
);

let sentense = segment.join(" ").trim();
sentense = sentense[0].toUpperCase() + sentense.substr(1);

console.log(sentense.split(" "));

/**
 <!-- begin snippet: js hide: false console: true babel: false -->

<!-- language: lang-js -->



<!-- end snippet -->


 
 
 */
