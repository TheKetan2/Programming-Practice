function inclusiveArray(startNum, endNum) {
  let sol = [];
  if (startNum >= endNum) {
    return [startNum];
  }
  for (let i = startNum; i <= endNum; i++) {
    sol.push(i);
  }
  return sol;
}
