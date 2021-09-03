function allPairs(arr, target) {
  let sol = [];
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] + arr[j] === target) {
        sol.push([Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])]);
        break;
      }
    }
  }
  sol.sort((a, b) => a[0] - b[0]);
  return sol;
}

let age = 20;
undefined;
let ageArr = Array.from({ length: 60 }, () => {
  let obj = { age: age };
  age++;
  return obj;
});

console.log(ageArr);
