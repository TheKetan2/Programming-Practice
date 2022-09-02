function measureDepth(arr) {
  let depth = 0;
  while (arr[0] !== undefined) {
    //console.log(arr);
    arr = arr[0];
    depth++;
  }
  return depth + 1;
}
