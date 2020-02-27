function binarySearch(arr, n) {
  let left = 0,
    right = arr.length - 1;
  let mid = (left + right) / 2;
  while (left <= right) {
    if (arr[mid] === n || arr[left] === n || arr[right] === n) {
      return true;
    }
    if (arr[mid] < n) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
    mid = (left + right) / 2;
  }
  return false;
}
