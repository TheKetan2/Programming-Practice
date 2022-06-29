function averageIndex(arr) {
  let sum = 0;
  for (let c of arr) {
    sum += c.charCodeAt() - "a".charCodeAt() + 1;
  }
  //console.log(sum/arr.length);
  return Number((sum / arr.length).toFixed(2));
}
