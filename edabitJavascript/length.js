function length(s) {
  return getLen(s);
}

function getLen(s) {
  let len = 0;
  for (s in [...s]) {
    len++;
  }
  return len;
}
