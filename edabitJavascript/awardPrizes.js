function awardPrizes(names) {
  let marks = [...new Set(Object.values(names))].sort((a, b) => b - a);
  console.log(marks);
  for (let key of Object.keys(names)) {
    if (marks.indexOf(names[key]) === 0) {
      names[key] = "Gold";
    } else if (marks.indexOf(names[key]) === 1) {
      names[key] = "Silver";
    } else if (marks.indexOf(names[key]) === 2) {
      names[key] = "Bronze";
    } else {
      names[key] = "Participation";
    }
  }
  return names;
}
