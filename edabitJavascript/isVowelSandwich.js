function isVowelSandwich(str) {
  let vow = "aeiou";
  if (str.length === 3) {
    return (
      !vow.includes(str[0]) && !vow.includes(str[2]) && vow.includes(str[1])
    );
  } else {
    return false;
  }
}
