//https://edabit.com/challenge/w5LTwJwDLK4uQ3Dmv
function group(arr, size) {
  let len = Math.ceil(arr.length / size);
  let sol = Array.from({ length: len }, () => []);
  for (let i = 0; i < arr.length; i++) {
    sol[i % len].push(arr[i]);
  }
  return sol;
}
