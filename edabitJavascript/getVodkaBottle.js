function getVodkaBottle(obj, num) {
  for (let key of Object.keys(obj)) {
    if (key.includes("Rammstein") && obj[key] == num) {
      return key;
    }
  }
}
