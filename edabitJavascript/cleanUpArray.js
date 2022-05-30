function cleanUpArray(arr) {
  arr = arr.map((n) => Number(n));
  return [
    arr.filter((num) => Number(num) % 2 == 0),
    arr.filter((num) => Number(num) % 2),
  ];
}
