function assignPersonToJob(names, jobs) {
  let sol = {};
  for (let i in names) {
    sol[names[i]] = jobs[i];
  }
  return sol;
}
