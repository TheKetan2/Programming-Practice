function decomposeAddress(str) {
  let arr = str.split(" ");
  //console.log(arr)
  let stNum = arr[0],
    st = arr[1] + " " + arr[2],
    city = arr[3] + " " + arr[4].replace(",", ""),
    state = arr[5],
    zip = arr[6];
  let data = [stNum, st, city, state, zip].filter((d) => d);
  return data.length == 5
    ? data
    : [stNum, st, ...city.split(",").map((w) => w.trim()), state];
}
