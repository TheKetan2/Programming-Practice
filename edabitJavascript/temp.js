function rollingCipher(str, n) {
  for (let ch of [...str]) {
    let charCode = ch.charCodeAt() + n;
    if (charCode > "z".charCodeAt()) {
      charCode = charCode - "z".charCodeAt();
      charCode += "a".charCodeAt() - 1;
    } else if (charCode < "a".charCodeAt()) {
      charCode = "a".charCodeAt() - charCode;
      charCode = "z".charCodeAt() - charCode + 1;
    }
    console.log(String.fromCharCode(charCode));
  }
}

rollingCipher("abcd", 3); //➞ "bcde"

// rollingCipher("abcd", -1) ➞ "zabc"

// rollingCipher("abcd", 3) ➞ "defg"

// rollingCipher("abcd", 26) ➞ "abcd"
