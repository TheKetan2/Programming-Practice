// Create a function to concatenate two integer arrays.

// Examples
// concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]

// concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]

// concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞[4, 5, 1, 3, 3, 3, 3, 3]

function concat(arr1, arr2) {
  return arr1.concat(arr2);
}

// Create a function that returns true if a string contains any spaces.

// Examples
// hasSpaces("hello") ➞ false

// hasSpaces("hello, world") ➞ true

// hasSpaces(" ") ➞ true

// hasSpaces("") ➞ false

// hasSpaces(",./!@#") ➞ false

function hasSpaces(str) {
  return str.indexOf(" ") >= 0 ? true : false;
}

// Create a function that takes a number as an argument and returns "even" for even numbers and "odd" for odd numbers.

// Examples
// isEvenOrOdd(3) ➞ "odd"

// isEvenOrOdd(146) ➞ "even"

// isEvenOrOdd(19) ➞ "odd"

function oddEven(num) {
  return num % 2 === 0 ? "even" : "odd";
}

// Write a function to check if an array contains a particular number.

// Examples
// check([1, 2, 3, 4, 5], 3) ➞ true

// check([1, 1, 2, 1, 1], 3) ➞ false

// check([5, 5, 5, 6], 5) ➞ true

// check([], 5) ➞ false

function check(arr, el) {
  return arr.indexOf(el) !== -1;
}

// Create a function that converts a date formatted as MM/DD/YYYY to a format required as YYYYDDMM. The parameter userDate and the return value are strings.

// Examples
// formatDate("11/12/2019") ➞ "20191211"

// formatDate("12/31/2019") ➞ "20193112"

function formatDate(userDate) {
  return userDate
    .split("/")
    .reverse()
    .join("");
}

// Function to return exponential value

function calculateExponent(num, exp) {
  // return Math.pow(num, exp)
  return num ** exp;
}

// Create a function that takes an array and a string as arguments and return the index of the string.

// Examples
// find_index(["hi", "edabit", "fgh", "abc"], "fgh") ➞ 2

// find_index(["Red", "blue", "Blue", "Green"], "blue") ➞ 1

// find_index(["a", "g", "y", "d"], "d") ➞ 3

// find_index(["Pineapple", "Orange", "Grape", "Apple"], "Pineapple") ➞ 0

function find_index(arr, str) {
  return arr.indexOf(str);
}

// Create a function that takes in three arguments (prob, prize, pay) and returns true if prob * prize > pay; otherwise return false.

// To illustrate, profitableGamble(0.2, 50, 9) should yield true, since the net profit is 1 (0.2 * 50 - 9), and 1 > 0.

function profitableGamble(prob, prize, pay) {
  return prob * prize > pay;
}

// Tom is a very methodic guy that loves geometry and pizza: he loves them so much that, before eating a pizza, he calculates its radius and its height. Now, he wants to know from you the total volume of pizza that he swallowed!

// You are given the two parameters that Tom measured:

// radius
// height
// He tells you that if you multiply the height for the square of the radius and multiply the result for the mathematical constant π (Pi), you will obtain the total volume of the pizza. Implement a function that returns the volume of the pizza as a whole number, rounding it to the nearest integer (and rounding up for numbers with .5 as decimal part).

function volPizza(radius, height) {
  return Math.round(radius * radius * 3.14159 * height);
}

// Write a function that returns true if k^k == n for input (n, k).

// Examples
// kToK(4, 2) ➞ true

// kToK(387420489, 9) ➞ true
// // 9^9 == 387420489

// kToK(3124, 5) ➞ false

// kToK(17, 3) ➞ false

function kToK(n, k) {
  return k ** k === n;
}

// Write a function that validates whether two strings are identical. Make it case insensitive.

// Examples
// match("hello", "hELLo") ➞ true

// match("motive", "emotive") ➞ false

// match("venom", "VENOM") ➞ true

// match("mask", "mAskinG") ➞ false

function match(s1, s2) {
  return s1.toLowerCase() === s2.toLowerCase();
}

function stackBoxes(n) {
  return n ** 2;
}

function equalSlices(total, people, each) {
  return total >= people * each;
}

function operation(num1, num2) {
  if (num1 + num2 === 24) return "added";
  if (num1 * num2 === 24) return "multiplied";
  if (num1 - num2 === 24 || num2 - num1 === 24) return "subtracted";
  if (num1 / num2 === 24 || num2 / num1 === 24) return "divided";
  return null;
}

function negate(arr) {
  return arr.map(item => -item);
}

function programmers(one, two, three) {
  let arr = [one, two, three].sort((a, b) => a - b);
  return arr[2] - arr[0];
}

function isEqual(num1, num2) {
  if (typeof num1 === "string" || typeof num2 === "string") return false;
  return num1 === num2;
}
function diffMaxMin(arr) {
  arr.sort((a, b) => a - b);
  return arr[arr.length - 1] - arr[0];
}

function numberSyllables(word) {
  return word.split("-").length;
}

function hasKey(obj, key) {
  for (k in obj) {
    if (k === key) return true;
  }
  return false;
}

function both(n1, n2) {
  if ((n1 > 0 && n2 > 0) || n1 === n2) return true;
  if (n1 < 0 && n2 < 0) return true;
  return false;
}

// Create a function that takes an integer and returns an array from 1 to the given number, where:

// If the number can be divided evenly by 4, amplify it by 10 (i.e. return 10 times the number).
// If the number cannot be divided evenly by 4, simply return the number.

function amplify(num) {
  let solution = [];
  for (let i = 1; i <= num; i++) {
    if (i % 4 == 0) solution.push(i * 10);
    else solution.push(i);
  }
  return solution;
}

function difference(nums) {
  nums.sort((a, b) => a - b);
  return nums[nums.length - 1] - nums[0];
}

function netPresentValue(pv, ir, years) {
  //pv * (1 - (1 + investment rate) ^negative number of years) / investment rate
  let npv = Math.round(((1 - (1 + ir) ** -years) / ir) * pv);
  return npv < 0 ? false : `\$${npv}`;
}

function missingAngle(angle1, angle2) {
  let thirdAngle = 180 - (angle1 + angle2);
  return thirdAngle == 90 ? "right" : thirdAngle > 90 ? "obtuse" : "acute";
}

function countWords(str) {
  return str.split(" ").length;
}

function getSequence(low, high) {
  let solution = [];
  for (let i = low; i <= high; i++) {
    solution.push(i);
  }
  return solution;
}

function canPartition(arr) {
  let positiveArr = arr.map(item => (item < 0 ? -item : item));
  let index = positiveArr.indexOf(Math.max(...positiveArr));

  return (
    arr.filter(num => num === 0).length > 1 ||
    arr[index] === arr.reduce((a, b) => a * b) / arr[index]
  );
}

function isBetween(first, last, word) {
  let arr = [first, word, last];
  return arr.join("") === arr.sort().join("");
}

function FizzBuzz(num) {
  if (num % 15 === 0) return "FizzBuzz";
  if (num % 3 === 0) return "Fizz";
  if (num % 5 === 0) return "Buzz";
  return num.toString();
}

function retrieveMajor(semver) {
  return semver.split(".")[0];
}

function retrieveMinor(semver) {
  return semver.split(".")[1];
}

function retrievePatch(semver) {
  return semver.split(".")[2];
}

function scoreCalculator(easy, med, hard) {
  if (easy < 0 || med < 0 || hard < 0) return "invalid";
  return easy * 5 + med * 10 + hard * 20;
}

// Fix this incorrect code!
function checkAllEven(arr) {
  return arr.every(num => num % 2 === 0);
}

function getStudentNames(students) {
  let solution = [];
  students.forEach(student => solution.push(student["name"]));
  return solution;
}

function hurdleJump(hurdles, jumpHeight) {
  return hurdles.every(h => h <= jumpHeight);
}

function findLargestNum(arr) {
  return Math.max(...arr);
}

function countIdentical(arr) {
  let solution = 0;
  arr.forEach(arr => {
    if (arr.filter(num => num !== arr[0]).length === 0) solution++;
  });
  return solution;
}

function countIdentical(arr) {
  return arr.filter(e => {
    return new Set(e).size === 1;
  }).length;
}

function mysteryFunc(arr, num) {
  return arr.map(arrNum => arrNum % num);
}

function MultiplyByLength(arr) {
  return arr.map(num => num * arr.length);
}

class Calculator {
  // Write functions to add(), subtract(), multiply() and divide()
  add(a, b) {
    return a + b;
  }
  subtract(a, b) {
    return a - b;
  }
  multiply(a, b) {
    return a * b;
  }
  divide(a, b) {
    return a / b;
  }
}

// Fix this code
function checkEquals(arr1, arr2) {
  if (arr1.join(".") === arr2.join(".")) {
    return true;
  } else {
    return false;
  }
}

function filterList(l) {
  return l.filter(num => typeof num === "number");
}

function limitNumber(num, rangeLow, rangeHigh) {
  return [num, rangeLow, rangeHigh].sort((a, b) => a - b)[1];
}

function removeNull(arr) {
  return arr.filter(num => num != null);
}

function calcDeterminant(matrix) {
  return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
}

function countAll(str) {
  let solution = { LETTERS: 0, DIGITS: 0 };
  str = str.replace(/\s/g, "");
  solution.DIGITS = str.split("").filter(c => c >= "0" && c <= "9").length;
  solution.LETTERS = str.split("").length - solution.DIGITS;
  return solution;
}

function canConcatenate(arr, target) {
  return (
    JSON.stringify(
      arr.reduce((a, b) => a.concat(b)).sort((n1, n2) => n1 - n2)
    ) === JSON.stringify(target.sort((n1, n2) => n1 - n2))
  );
}

function getWord(left, right) {
  return left[0].toUpperCase() + left.substr(1) + right;
}

function sameCase(str) {
  return str.toUpperCase() === str ? true : str.toLowerCase() === str;
}

function Go(num) {
  return "-".repeat(num);
}

function maxHam(s1, s2) {
  if (
    s1
      .split("")
      .sort()
      .join("") !=
    s2
      .split("")
      .sort()
      .join("")
  )
    return false;
  let sol = 0;
  for (var i = 0; i < s1.length; i++) {
    if (s1[i] != s2[i]) sol++;
  }
  return sol === s1.length ? true : sol;
}

// Fix this incorrect code, so that all tests pass!
function removeVowels(str) {
  return str.replace(/[aeiou]/g, "");
}

function findEvenNums(num) {
  let solution = [];
  for (let i = 2; i <= num; i += 2) {
    solution.push(i);
  }
  return solution;
}

function noStrangers(str) {
  let aq = new Set();
  let fr = new Set();
  let strArr = str
    .toLowerCase()
    .replace(/[^a-z' ]/g, "")
    .split(" ");
  let uniqueWords = new Set(strArr);
  let wordObj = {};
  for (word of [...uniqueWords]) {
    wordObj[word] = 0;
  }
  //console.log(wordObj);

  for (word of strArr) {
    wordObj[word] += 1;
    if (wordObj[word] >= 3 && wordObj[word] < 5) aq.add(word);
    else if (wordObj[word] >= 5) fr.add(word);
    //console.log("length: ",len, "Word: ", word);
  }

  for (word of fr) {
    aq.delete(word);
  }

  return [[...aq], [...fr]];
}

function boundSort(arr, bounds) {
  console.log("main array: ", arr);
  let slicedArray = arr.slice(bounds[0], bounds[1] + 1);
  slicedArray = slicedArray.sort((a, b) => a - b);
  console.log("subarray: ", slicedArray);
  slicedArray = slicedArray.concat(arr.slice(bounds[1] + 1));
  console.log(slicedArray);
  for (let i = 1; i < arr.length; i++) {
    if (slicedArray[i - 1] > slicedArray[i]) return false;
  }
  return true;
}

function checkPalindrome(str) {
  return (
    str ===
    str
      .split("")
      .reverse()
      .join("")
  );
}

function findSmallestNum(arr) {
  return Math.min(...arr);
}

function sevenBoom(arr) {
  return JSON.stringify(arr).indexOf(7) >= 0
    ? "Boom!"
    : "there is no 7 in the array";
}

function tapCode(text) {
  const morseCode = {
    a: ". .",
    b: ". ..",
    c: ". ...",
    d: ". ....",
    e: ". .....",
    f: ".. .",
    g: ".. ..",
    h: ".. ...",
    i: ".. ....",
    j: ".. .....",
    k: ". ...",
    l: "... .",
    m: "... ..",
    n: "... ...",
    o: "... ....",
    p: "... .....",
    q: ".... .",
    r: ".... ..",
    s: ".... ...",
    t: ".... ....",
    u: ".... .....",
    v: "..... .",
    w: "..... ..",
    x: "..... ...",
    y: "..... ....",
    z: "..... ....."
  };

  const revMorse = {
    ". .": "a",
    ". ..": "b",
    ". ...": "c",
    ". ....": "d",
    ". .....": "e",
    ".. .": "f",
    ".. ..": "g",
    ".. ...": "h",
    ".. ....": "i",
    ".. .....": "j",
    "... .": "l",
    "... ..": "m",
    "... ...": "n",
    "... ....": "o",
    "... .....": "p",
    ".... .": "q",
    ".... ..": "r",
    ".... ...": "s",
    ".... ....": "t",
    ".... .....": "u",
    "..... .": "v",
    "..... ..": "w",
    "..... ...": "x",
    "..... ....": "y",
    "..... .....": "z"
  };
  sol = "";
  if (text.indexOf(".") < 0) {
    for (ch of text.split("")) {
      sol += morseCode[ch];
      sol += " ";
    }
  } else {
    let str = text.split(" ");
    for (let i = 0; i < str.length; i += 2) {
      console.log([str[i] + " " + str[i + 1]]);
      sol += revMorse[str[i] + " " + str[i + 1]];
    }
  }
  return sol.trim();
}

function existsHigher(arr, n) {
  return arr.filter(num => num >= n).length > 0;
}

function findLargestNum(arr) {
  return Math.max(...arr);
}

function transform(arr) {
  return arr.map(num => (num % 2 == 0 ? num - 1 : num + 1));
}

function nextElement(arr) {
  return arr[arr.length - 1] + arr[1] - arr[0];
}

let arr = [1, 2, 3, 4, 5, 6];
removeNum = numToBeRemoved => arr.filter(num => num != numToBeRemoved);

function countdown(start) {
  let sol = [];
  while (start >= 0) {
    sol.push(start);
    start--;
  }
  return sol;
}

function unlucky13(nums) {
  return nums.filter(num => num % 13 != 0);
}

function mapping(letters) {
  let smallCap = {};
  for (let s of letters) {
    smallCap[s] = String.fromCharCode(s.charCodeAt(0) - 32);
  }
  return smallCap;
}

"hello world how ya doing"
  .split("")
  .map((s, i) => (i % 2 != 0 ? s.toUpperCase() : s))
  .join("");

function dividesEvenly(a, b) {
  const div = a / b;
  console.log(div);
  return div === Math.round(div);
}

function checkFactors(factors, num) {
  return factors.filter(fNum => num % fNum != 0).length === 0;
}

function removeFirstLast(str) {
  return str.length <= 2 ? str : str.substr(1, str.length - 2);
}

function sharedDigits(arr) {
  for (let i = 1; i < arr.length; i++) {
    let str1 = Array.from(new Set(String(arr[i - 1]).split(""))).join("");
    let str2 = Array.from(new Set(String(arr[i]).split(""))).join("");
    let set = new Set(str1.split("").concat(str2.split("")));
    if ((str1 + str2).length === set.size) return false;
  }

  return true;
}

function isStrangePair(str1, str2) {
  if (str1.length === 0 && str2.length === 0) return true;
  return (
    str1.charAt(0) === str2.charAt(str2.length - 1) &&
    str2.charAt(0) === str1.charAt(str1.length - 1)
  );
}

function canCapture([yourRook, opponentsRook]) {
  let str = yourRook + opponentsRook;
  let set = new Set(str.split(""));
  return str.length != set.size;
}

// Fix this incorrect code so that all tests pass!
function flatten(arr) {
  return arr.flat();
}

function countVowels(str) {
  return str.length - str.replace(/[aeiou]/g, "").length;
}

function dictionary(initial, words) {
  return words.filter(word => word.indexOf(initial) === 0);
}

function sum(n) {
  let sum = 0;
  for (let i = 0; i <= n; i++) {
    sum += i;
  }
  return sum;
}

function sum(n) {
  // Reccursive solution
  return n == 1 ? n : n * sum(n - 1);
}

function noOdds(arr) {
  return arr.filter(num => num % 2 == 0);
}

function toArray(str) {
  return str.length === 0 ? [] : str.split(", ");
}

function capitalLetters(txt) {
  return txt.length - txt.replace(/[A-Z]/g, "").length;
}

function correctStream(user, correct) {
  let sol = [];
  for (let i = 0; i < user.length; i++) {
    user[i] === correct[i] ? sol.push(1) : sol.push(-1);
  }
  return sol;
}

function replaceVowels(str, ch) {
  return str.replace(/[aeiou]/g, ch);
}

function binaryToDecimal(binary) {
  let len = binary.length,
    num = 0;
  for (let i = 0, power = len - 1; i < len; i++, power--) {
    num += binary[i] === 1 ? Math.pow(2, power) : 0;
  }
  return num;
}

function isInOrder(str) {
  return (
    str ===
    str
      .split("")
      .sort()
      .join("")
  );
}

function subReddit(link) {
  let len = "https://www.reddit.com/r/".length;
  let sub = link.substr(len);
  let subLen = sub.length;
  return sub.substr(0, subLen - 1);
}

function evenOddPartition(arr) {
  let odd = [],
    even = [];
  for (a of arr) {
    a % 2 == 0 ? even.push(a) : odd.push(a);
  }
  return [even, odd];
}

function evenOddPartition(arr) {
  let odd = [],
    even = [];
  for (a of arr) {
    a % 2 == 0 ? even.push(a) : odd.push(a);
  }
  return [even, odd];
}

function reverse(bool) {
  return bool == true ? false : bool === false ? true : "boolean expected";
}

function divisible(arr) {
  return arr.reduce((a, b) => a * b) % arr.reduce((a, b) => a + b) === 0;
}

function nthSmallest(arr, n) {
  return arr.sort()[n - 1] ? arr.sort()[n - 1] : null;
}

function filterStateNames(arr, type) {
  return type === "abb"
    ? arr.filter(a => a.length === 2)
    : arr.filter(a => a.length > 2);
}

// Fix this incorrect code so that all tests pass!
function removeEmptyArrays(arr) {
  return arr.filter(x => x.length != 0);
}

function convertCartesian(x, y) {
  return x.map((ex, i) => [ex, y[i]]);
}

function oddProduct(arr) {
  return arr.filter(num => num % 2 != 0).reduce((a, b) => a * b);
}
function owofied(sentence) {
  let sol = sentence.replace(/["i"]/g, "wi");
  return sol.replace(/["e"]/g, "we") + " owo";
}

function last(a, n) {
  return a.length < n ? "invalid" : n == 0 ? [] : a.splice(a.length - n);
}

function totalCups(n) {
  return n + Math.floor(n / 6);
}

function howManyTimes(num) {
  return `Ed${"a".repeat(num)}bit`;
}

function isFourLetters(arr) {
  return arr.filter(a => a.length === 4);
}

function filterDigitLength(arr, num) {
  return arr.filter(a => (a + "").length === num);
}

function AlphabetSoup(str) {
  return str
    .split("")
    .sort()
    .join("");
}

function nextPrime(num) {
  while (true) {
    if (isPrime(num)) return num;
    num++;
  }
}

const isPrime = num => {
  for (let i = 2; i < Math.sqrt(num) + 1; i++) {
    if (num % i === 0) return false;
  }
  return true;
};

function greetPeople(names) {
  return names.map(name => "Hello " + name).join(", ");
}

function isPositiveDominant(a) {
  let set = new Set(a);
  return (
    Array.from(set).filter(num => num < 0).length <
    Array.from(set).filter(num => num > 0).length
  );
}

function isEmpty(obj) {
  return JSON.stringify(obj).replace(/[{}]/g, "").length ? false : true;
}

function abcmath(a, b, c) {
  while (b--) {
    a += a;
  }
  return a % c === 0;
}

function hashPlusCount(str) {
  return [str.replace(/[^#]/g, "").length, str.replace(/[^+]/g, "").length];
}

function getAbsSum(arr) {
  return arr
    .map(num => (num < 0 ? -num : num))
    .reduce((acc, curr) => acc + curr);
}

function filterArray(arr) {
  return arr.filter(elem => typeof elem != "string");
}

function doubleChar(str) {
  let sol = "";
  for (let i = 0; i < str.length; i++) {
    sol += str.charAt(i) + str.charAt(i);
  }
  return sol;
}

function factorial(int) {
  if (int < 1) return 1;
  return int * factorial(int - 1);
}

function countVowels(str) {
  return str.replace(/[^aeiou]/g, "").length;
}

function set(arr) {
  return Array.from(new Set(arr));
}

function firstVowel(str) {
  for (let i = 0; i < str.length; i++) {
    if ("aeiou".includes(str.toLowerCase().charAt(i))) {
      return i;
    }
  }

  return -1;
}

function societyName(friends) {
  return friends
    .map(f => f.charAt(0))
    .sort()
    .join("");
}
/*
chatroomStatus([]) ➞ "no one online"

chatroomStatus(["paRIE_to"]) ➞ "parIE_to online"

chatroomStatus(["s234f", "mailbox2"]) ➞ "s234f and mailbox2 online"

chatroomStatus(["pap_ier44", "townieBOY", "panda321", "motor_bike5", "sandwichmaker833", "violinist91"])
➞ "pap_ier44, townieBOY and 4 more online"
*/
function chatroomStatus(users) {
  return users.length === 0
    ? "no one online"
    : users.length === 1
    ? users[0] + " online"
    : users.length === 2
    ? users[0] + " and " + users[1] + " online"
    : `${users[0]}, ${users[1]} and ${users.length - 2} more online`;
}

function sayHelloBye(name, num) {
  return num
    ? "Hello " + name.charAt(0).toUpperCase() + name.substr(1)
    : "Bye " + name.charAt(0).toUpperCase() + name.substr(1);
}

function convertBinary(str) {
  return str
    .toLowerCase()
    .split("")
    .map(c => (c >= "a" && c <= "m" ? "0" : "1"))
    .join("");
}
//Write a function that transforms all letters from
//[a, m] to 0 and letters from [n, z] to 1 in a string.

function sumOfCubes(nums) {
  let sol = 0;
  for (num of nums) {
    sol += num * num * num;
  }
  return sol;
}

function spelling(str) {
  let strTemp = str;
  return str.split("").map((s, i) => strTemp.substr(0, i + 1));
}

String.prototype.swapCase = function() {
  return this.split("")
    .map(char =>
      char >= "a" && char <= "z"
        ? char.toUpperCase()
        : char >= "A" && char <= "Z"
        ? char.toLowerCase()
        : char
    )
    .join("");
};

/* Fill in 5 array prototype methods below:
	1. square()
	2. cube()
	3. divisible_by()
	4. strictly_above()
	5. strictly_below()
*/

Array.prototype.square = function() {
  return this.map(num => num * num);
};

Array.prototype.cube = function() {
  return this.map(num => num * num * num);
};

Array.prototype.divisible_by = function(x) {
  return this.filter(num => num % x === 0);
};

Array.prototype.strictly_above = function(x) {
  return this.filter(num => num > x);
};

Array.prototype.strictly_below = function(x) {
  return this.filter(num => num < x);
};

function maximumScore(tileHand) {
  return tileHand.map(obj => obj.score).reduce((a, b) => a + b);
}

function mauriceWins(mSnails, sSnails) {
  let sol = 0;
  mSnails.sort((a, b) => a - b);
  sSnails.sort((a, b) => a - b);

  if (mSnails[0] > sSnails[2]) {
    sol += 1;
  }
  if (mSnails[1] > sSnails[0]) {
    sol += 1;
  }
  if (mSnails[2] > sSnails[1]) {
    sol += 1;
  }
  console.log(sol);
  return sol > 1;
}

function myPi(n) {
  let pi = "3.14159265358979323";
  let sol = "3." + Math.round(parseInt(pi.substr(2, n + 1)) / 10);
  return parseFloat(sol);
}

function capToFront(s) {
  return s.replace(/[^A-Z]/g, "") + s.replace(/[^a-z]/g, "");
}

function isAvgWhole(arr) {
  let avg = arr.reduce((acc, curr) => acc + curr) / arr.length;
  return avg === Math.round(avg);
}

function isSymmetrical(num) {
  let str = num + "";
  return (
    str ===
    str
      .split("")
      .reverse()
      .join("")
  );
}

function removeVowels(str) {
  return str.replace(/[aeiouAEIOU]/g, "");
}

function joinPath(portion1, portion2) {
  return portion1.replace(/[/]/g, "") + "/" + portion2.replace(/[/]/g, "");
}

function leftDigit(num) {
  return parseInt(num.replace(/[^0-9]/g, "")[0]);
}

function isPrefix(word, prefix) {
  return word.indexOf(prefix.substr(0, prefix.length - 1)) === 0;
}

function isSuffix(word, suffix) {
  return word.indexOf(suffix.substr(1)) === word.length - (suffix.length - 1);
}

function charIndex(word, char) {
  if (word.indexOf(char) === -1) return undefined;
  return [word.indexOf(char), word.lastIndexOf(char)];
}

function toArray(num) {
  return (num + "").split("").map(num => parseInt(num));
}

function toNumber(arr) {
  return parseInt(JSON.stringify(arr).replace(/[^0-9]/g, ""));
}

function validateSwaps(arr, str) {
  return arr.map(word => {
    if (word.length != str.length) return false;
    else
      return word.split("").filter((ch, i) => ch != str.charAt(i)).length === 2;
  });
}

function sortByLength(arr) {
  return arr.sort((a, b) => a.length - b.length);
}

function isOmnipresent(arr, val) {
  for (a of arr) {
    if (!a.includes(val)) return false;
  }
  return true;
}

function isValid(zip) {
  return zip.length === 5 ? zip.replace(/[^0-9]/g, "").length === 5 : false;
}

function findNemo(sentence) {
  let sol = 0;
  for (word of sentence.split(" ")) {
    if (word === "Nemo") return `I found Nemo at ${sol + 1}!`;
    sol++;
  }
  return "I can't find Nemo :(";
}

function reverseCase(str) {
  return str
    .split("")
    .map(ch => (ch === ch.toLowerCase() ? ch.toUpperCase() : ch.toLowerCase()))
    .join("");
}

function findLargestNums(arr) {
  return arr.map(a => Math.max(...a));
}

function totalVolume(...boxes) {
  return boxes
    .map(box => box.reduce((acc, curr) => acc * curr))
    .reduce((acc, curr) => acc + curr);
}

function isSpecialArray(arr) {
  return (
    arr.filter(
      (num, i) => (i % 2 === 0 && num % 2 === 0) || (i % 2 != 0 && num % 2 != 0)
    ).length === arr.length
  );
}

function sortDescending(num) {
  return parseInt(
    (num + "")
      .split("")
      .sort()
      .reverse()
      .join("")
  );
}

function highLow(str) {
  let arr = str.split(" ").map(num => parseInt(num));
  return [Math.max(...arr), Math.min(...arr)].join(" ");
}

function formatPhoneNumber(numbers) {
  let str = numbers.join("");
  return `(${str.substr(0, 3)}) ${str.substr(3, 3)}-${str.substr(6)}`;
}

function isSastry(number) {
  let sqrt = Math.sqrt(parseInt(number + "" + (number + 1)));
  return Math.round(sqrt) === sqrt;
}

function factorChain(arr) {
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] % arr[i - 1] != 0) return false;
  }
  return true;
}

function sortNumsAscending(arr) {
  return arr ? arr.sort((a, b) => a - b) : [];
}

function indexShuffle(str) {
  let odd = "",
    even = "";
  for (let i = 0; i < str.length; i += 2) {
    even += str.charAt(i);
    odd += str.charAt(i + 1);
  }
  return even + odd;
}

function getDistance(a, b) {
  return parseFloat(
    Math.sqrt(
      (-a.x + b.x) * (-a.x + b.x) + (-a.y + b.y) * (-a.y + b.y)
    ).toFixed(3)
  );
}

function specialReverse(s, c) {
  return s
    .split(" ")
    .map(word =>
      word.indexOf(c) === 0
        ? word
            .split("")
            .reverse()
            .join("")
        : word
    )
    .join(" ");
}

function countOnes(matrix) {
  return matrix.flat().filter(num => num === 1).length;
}

function asciiCapitalize(str) {
  return str
    .split("")
    .map(ch => (ch.charCodeAt() % 2 == 0 ? ch.toUpperCase() : ch.toLowerCase()))
    .join("");
}

function filterUnique(arr) {
  return arr.filter(word => new Set(word.split("")).size === word.length);
}

function century(year) {
  let post =
    Math.ceil(year / 100) <= 20
      ? "th"
      : Math.ceil(year / 100) % 10 === 1
      ? "st"
      : Math.ceil(year / 100) % 10 === 2
      ? "nd"
      : Math.ceil(year / 100) % 10 === 3
      ? "rd"
      : "th";
  return `${Math.ceil(year / 100)}${post} century`;
}

function flip(y) {
  return y ? 0 : 1;
}

String.prototype.vreplace = function(vowel) {
  return this.replace(/[aeiou]/g, vowel);
};
