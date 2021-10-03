function depth(arr) {
  let sol = Array.isArray(arr) ? 1 : 0;
  let temp = [...arr];
  while (Array.isArray(temp)) {
    for (let item of temp) {
      if (Array.isArray(item)) {
        temp = [...item];
        sol++;
        break;
      } else {
        temp = item;
      }
    }
  }
  return sol;
}
