function notShare(arr1, arr2) {
  for (let i of arr1) {
    for (let j of arr2) {
      if (i === j) return false;
    }
  }
  return true;
}
