function jazzify(arr) {
  return arr.map((item) => (item.includes("7") ? item : `${item + 7}`));
}
