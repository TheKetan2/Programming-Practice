function findFrequent(arr) {
  let map = { null: null, undefined: undefined, true: true, false: false };
  let obj = arr.reduce(
    (acc, curr) =>
      acc[curr] ? { ...acc, [curr]: acc[curr] + 1 } : { ...acc, [curr]: 1 },
    {}
  );
  let entry = Object.entries(obj).sort((a, b) => b[1] - a[1])[0][0];
  return !isNaN(parseInt(entry))
    ? parseInt(entry)
    : Object.keys(map).includes(entry)
    ? map[entry]
    : entry;
}
