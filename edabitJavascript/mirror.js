function mirror(arr) {
  return [...arr, ...arr.reverse().slice(1)];
}
