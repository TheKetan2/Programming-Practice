function cleanUpArray(arr) {
  return [
    arr.filter((num) => Number(num) % 2 == 0).map((n) => Number(n)),
    arr.filter((num) => Number(num) % 2).map((n) => Number(n)),
  ];
}
