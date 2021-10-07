const animals = [
  "muggercrocodile",
  "one-hornedrhino",
  "python",
  "moth",
  "monitorlizard",
  "bengaltiger",
];
function faunaNumber(str) {
  let strArr = str
    .replace("There are", "")
    .trim()
    .replace(".", "")
    .replace("and", ",")
    .split(",");
  return strArr
    .map((item) => {
      let temp = item.trim().split(" ");
      return { [temp[1]]: parseInt(temp[0]) };
    })
    .filter((item) => animals.includes(Object.keys(item)[0]));
}
