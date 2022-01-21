function camelCasing(str) {
  let strArr = str.replace(/[_]/g, " ").toLowerCase().split(" ");
  return strArr
    .map((w, index) => {
      if (index == 0) {
        return w;
      } else {
        return w[0].toUpperCase() + w.slice(1);
      }
    })
    .join("");
}
