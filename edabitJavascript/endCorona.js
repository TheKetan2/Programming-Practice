function endCorona(recovers, newCases, activeCases) {
  let days = 0;
  while (activeCases > 0) {
    activeCases += newCases;
    activeCases -= recovers;
    days++;
  }
  return days;
}
