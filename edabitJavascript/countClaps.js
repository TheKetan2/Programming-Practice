function countClaps(str) {
  return str.length - str.replace(/[Cc]/g, "").length;
}
