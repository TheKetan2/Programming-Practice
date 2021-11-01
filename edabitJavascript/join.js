function join(arr) {
  let len = 9999;
  let sol = "";
  for (let i = 0; i < arr.length - 1; i++) {
    let j;
    let flag = false;
    for (j = 0; j < arr[i].length; j++) {
      if (arr[i + 1].indexOf(arr[i].substr(j)) === 0) {
        sol += arr[i].substr(0, j);
        console.log(
          len,
          arr[i].substr(0, j),
          arr[i],
          arr[i + 1],
          arr[i + 1].indexOf(arr[i].substr(j))
        );
        len = Math.min(
          Math.abs(arr[i].length - arr[i].substr(0, j).length),
          len
        );
        flag = true;
        break;
      }
    }
    if (flag == false) {
      sol += arr[i];
    }
    console.log(flag);
  }
  sol += arr.pop();
  //	console.log([sol, len==9999?0:len])
  return [sol, len === 9999 ? 0 : len];
}
