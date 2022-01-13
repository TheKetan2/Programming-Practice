function simpleComp(arr1, arr2) {
  if (arr1 == null || arr2 == null) {
    return false;
  }
  if (arr1.length !== arr2.length) {
    return false;
  }
  arr1.sort();
  arr2.sort();
  let sol = arr1.filter((num, index) => arr2[index] === num * num);
  return sol.length === arr1.length;
}
