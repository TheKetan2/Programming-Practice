function filterString(txt) {
  let capLen = txt.replace(/[^A-Z]/g, "").length;
  let lowLen = txt.replace(/[^a-z]/g, "").length;
  let numLen = txt.replace(/[^0-9]/g, "").length;
  return [capLen, lowLen, numLen, txt.length - (capLen + lowLen + numLen)];
}
