function staircase(n) {
  let sol = [];
  let abs = Math.abs(n);
  for (let i = 0; i < abs; i++) {
    sol.push(
      Array.from({ length: abs - i }, () => "#")
        .join("")
        .padStart(abs, "_")
    );
  }
  return n >= 0 ? sol.reverse().join("\n") : sol.join("\n");
}
