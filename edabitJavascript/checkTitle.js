function checkTitle(title) {
  for (let word of title.split(" ")) {
    if (word[0].toUpperCase() !== word[0]) {
      return false;
    }
  }
  return true;
}
