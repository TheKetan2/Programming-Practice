function pHName(pH) {
  return pH < 0 || pH > 14
    ? "invalid"
    : pH >= 0 && pH < 7
    ? "acidic"
    : pH > 7 && pH <= 14
    ? "alkaline"
    : "neutral";
}
