function sumsPowersTwo(n) {
  console.log(n.toString(2).split("").reverse());
  let sol = n
    .toString(2)
    .split("")
    .reverse()
    .map((n, index) => {
      return (2 * n) ** index;
    })
    .filter((num) => num !== 0);
  if (n % 2 == 0) {
    if (sol[0] == 1) {
      sol.shift();
    }
  }
  return sol;
}
