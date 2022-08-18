function canNest(arr1, arr2) {
  for (let num of arr2) {
    if (arr1.includes(num)) {
      return false;
    }
  }
  return true;
}
