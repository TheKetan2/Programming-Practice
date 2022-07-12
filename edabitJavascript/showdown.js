function showdown(p1, p2) {
  return p1.indexOf("B") < p2.indexOf("B")
    ? "p1"
    : p1.indexOf("B") > p2.indexOf("B")
    ? "p2"
    : "tie";
}
