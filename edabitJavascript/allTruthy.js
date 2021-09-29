function allTruthy(...args) {
  for (let value of args) {
    if (!value) return false;
  }
  return true;
}
