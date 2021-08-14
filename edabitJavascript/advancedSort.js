//https://edabit.com/challenge/SAeaT8pzJDkSoACsi
function advancedSort(arr) {
  let obj = {};
  for (let index in arr) {
    if (obj[arr[index]]) {
      obj[arr[index]] = {
        ...obj[arr[index]],
        count: obj[arr[index]].count + 1,
      };
    } else {
      obj[arr[index]] = {
        index: Number(index),
        count: Number(1),
        num: arr[index],
      };
    }
  }
  //console.log(obj)
  let sortedArr = Object.values(obj).map((values) => values);
  sortedArr.sort((a, b) => a.index - b.index);
  return sortedArr.map((item) =>
    Array.from({ length: item.count }, () => item.num)
  );
}
