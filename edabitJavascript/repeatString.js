function repeatString(txt, n) {
  return typeof txt != "string"
    ? "Not A String !!"
    : Array.from({ length: n }, () => txt).join("");
}
