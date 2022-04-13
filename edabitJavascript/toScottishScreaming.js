function toScottishScreaming(str) {
  return [...str.toUpperCase()]
    .map((ch) => ("AEIOU".includes(ch) ? "E" : ch))
    .join("");
}
