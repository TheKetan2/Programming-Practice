function rotateByOne(arr) {
  arr.unshift(arr.pop());
  return arr;
}
