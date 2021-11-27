function isSet(cards) {
  let sol = [];
  let keys = Object.keys(cards[0]);
  for (let i = 0; i < 4; i++) {
    let set = new Set();
    for (let j = 0; j < cards.length; j++) {
      //console.log(cards[j][keys[i]])
      set.add(cards[j][keys[i]]);
    }
    sol.push(set.size);
  }
  //console.log(sol);
  return sol.includes(2) ? false : true;
}
