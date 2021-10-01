function maxPossible(n1, n2) {
  let sol = "";
  let arrOne = [...n1.toString()].map((num) => parseInt(num));
  let arrTwo = [...n2.toString()].map((num) => parseInt(num));
  arrTwo.sort((a, b) => b - a);
  for (let i in arrOne) {
    if (arrOne[i] < arrTwo[0]) {
      sol += arrTwo[0];
      arrTwo.shift();
    } else {
      sol += arrOne[i];
    }
  }
  return parseInt(sol);
}
