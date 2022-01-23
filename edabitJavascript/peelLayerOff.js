function peelLayerOff(arr) {
  arr.shift();
  arr.pop();
  for (a of arr) {
    a.pop();
    a.shift();
  }
  return arr;
}
