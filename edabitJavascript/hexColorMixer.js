function hexColorMixer(colors) {
  let colorArr = [];
  for (let color of colors) {
    let temp = [];
    for (let i = 1; i < color.length; i += 2) {
      temp.push("0x" + color.substr(i, 2));
    }
    colorArr.push(temp);
  }
  let colorArrTrans = [];
  for (let i = 0; i < colorArr[0].length; i++) {
    let temp = [];
    for (let j = 0; j < colorArr.length; j++) {
      temp.push(colorArr[j][i]);
    }
    colorArrTrans.push(temp);
  }
  let sol = colorArrTrans
    .map((a) => a.reduce((acc, curr) => parseInt(curr) + acc, 0))
    .map((a) => {
      let temp = Math.round(a / colors.length).toString(16);
      if (temp.length == 1) {
        return "0" + temp;
      }
      return temp;
    });

  return "#" + sol.join("").toUpperCase();
}
