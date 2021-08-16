function commonElements(arr1, arr2) {
  let sol = [];
  for (let num1 of arr1) {
    let temp = arr2.filter((num2) => num1 === num2);
    sol = [...sol, ...temp];
  }
  return [...new Set(sol)];
}
