function balanced(arr) {
  let half = arr.length / 2;
  let [h1, h2] = [arr.slice(0, half), arr.slice(half)];
  let h1Sum = h1.reduce((acc, curr) => acc + curr, 0);
  let h2Sum = h2.reduce((acc, curr) => acc + curr, 0);
  if (h1Sum == h2Sum) {
    return arr;
  } else if (h1Sum > h2Sum) {
    return [...h1, ...h1];
  }
  return [...h2, ...h2];
}
