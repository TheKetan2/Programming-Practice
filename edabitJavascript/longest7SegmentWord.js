function longest7SegmentWord(arr) {
  let result = arr.filter(
    (word) =>
      !word.includes("k") &&
      !word.includes("k") &&
      !word.includes("m") &&
      !word.includes("v") &&
      !word.includes("w") &&
      !word.includes("x")
  );
  result.sort((a, b) => b.length - a.length);
  return result[0] ? result[0] : "";
}
//Letters which do not fit on a 7 segment display are k, m, v, w and x.
