function stupidAddition(a, b) {
  if (typeof a == typeof b) {
    return typeof a == "string" ? Number(a) + Number(b) : a + "" + b;
  }
  return null;
}
