function minSwaps(s1, s2) {
  let sol = 0;
  for (let i = 0; i < s1.length; i++) {
    if (s1[i] !== s2[i]) {
      sol++;
    }
  }
  return sol / 2;
}
