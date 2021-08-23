function charBox(size) {
  let sol = [];
  if (size == 1) {
    return [["#"]];
  }
  let first = Array.from({ length: size }, () => "#");
  let mid = Array.from({ length: size - 2 }, () => " ");
  mid.unshift("#");
  mid.push("#");
  for (let i = 0; i < size; i++) {
    if (i == 0 || i == size - 1) {
      sol.push(first);
    } else {
      sol.push(mid);
    }
  }
  if (isNaN(parseInt(size)) || size < 0 || Math.round(size) !== size) {
    return -1;
  }
  return size == 0 ? [[]] : sol;
}
