function combine(user1Income, user2Income) {
  let sol = { ...user1Income };
  Object.keys(user2Income).forEach((key) => {
    if (sol[key]) {
      sol[key] += user2Income[key];
    } else {
      sol[key] = user2Income[key];
    }
  });
  let temp = Object.keys(sol).map((key) => [key, sol[key]]);
  temp.sort((a, b) => a[1] - b[1]);
  sol = {};
  temp.forEach((arr) => {
    sol = { ...sol, [arr[0]]: arr[1] };
  });
  return sol;
}
