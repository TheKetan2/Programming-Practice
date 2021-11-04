function colWithMaxSum(nums, n) {
  let arr = [];
  while (nums.length) {
    arr.push(nums.slice(0, n));
    nums.splice(0, n);
  }
  if (arr.length === 1) {
    let max = Math.max(...arr[0]);
    return arr[0].indexOf(max) + 1;
  }
  let sum = [];
  for (let i = 0; i < arr[0].length; i++) {
    let temp = 0;
    for (let j = 0; j < arr.length; j++) {
      temp += arr[j][i];
    }
    sum.push(temp);
  }
  let max = Math.max(...sum);
  return sum.indexOf(max) + 1;
}
