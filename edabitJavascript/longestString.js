function longestString(str1, str2) {
  return Array.from(new Set([...str1, ...str2].sort())).join("");
}
