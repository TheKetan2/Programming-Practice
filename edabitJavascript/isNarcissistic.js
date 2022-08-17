function isNarcissistic(n) {
  let num = [...n.toString()].map((a) => Number(a));
  return n === num.reduce((acc, curr) => acc + curr ** num.length, 0);
}
