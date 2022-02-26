function parity(n) {
  let remander = Boolean(n % 2);
  if (remander === false) {
    return "even";
  }
  if (remander === true) {
    return "odd";
  }
}
