function solution(s) {
  for (ch of s) {
    if (s.lastIndexOf(ch) === s.indexOf(ch)) return ch;
  }
  return "_";
}
