function stupidAddition(a, b) {
  if (typeof a == "string" && typeof b == "string") {
    return Number(a) + Number(b);
  }
  if (typeof a == "number" && typeof b == "number") {
    return a + "" + b;
  }
  return null;
}
