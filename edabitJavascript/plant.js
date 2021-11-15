function plant(seed, water, fert, temp) {
  let stem = Array.from({ length: water }, () => "-").join("");
  let flower = Array.from({ length: fert }, () => seed).join("");
  let sol = "";
  if (temp < 20 || temp > 30) {
    return Array.from({ length: water }, () => stem).join("") + seed;
  }
  for (let i = 0; i < water; i++) {
    sol += stem + flower;
  }
  return sol;
}
