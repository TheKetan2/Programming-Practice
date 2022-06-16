function ageDifference(ages) {
  ages.sort((a, b) => Number(a) - Number(b));
  let diff = ages.pop() - ages.pop();
  return diff == 0
    ? "No age difference between spouses."
    : diff == 1
    ? diff + " year"
    : diff + " years";
}
