function lcm(n1, n2) {
  let max = Math.max(n1, n2);
  while (true) {
    if (max % n1 == 0 && max % n2 == 0) {
      return max;
    } else {
      max++;
    }
  }
}
