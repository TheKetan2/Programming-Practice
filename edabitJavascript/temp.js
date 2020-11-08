/**
 <!-- begin snippet: js hide: false console: true babel: false -->

<!-- language: lang-js -->

var target = 13;
var arr = [{ num: 1 }, { num: 10 }, { num: 20 }];

let sol = null;
let lowestDiff = 999999;

for (let element of arr) {
  let diff = Math.abs(13 - element["num"]);
  if (diff < lowestDiff) {
    lowestDiff = diff;
    sol = null;
    sol = element;
  }
}

console.log(sol);

<!-- end snippet -->


 
 
 */
