function recurAdd(arr) {
  let len = arr.length;
  if (len <= 1) {
    return len == 1 ? arr[0] : 0;
  }
  let sum = arr.pop() + arr.pop();
  arr.push(sum);
  return recurAdd(arr);
}
