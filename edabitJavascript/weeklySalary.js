function weeklySalary(hours) {
  let salary = 0;
  for (let i = 0; i < hours.length; i++) {
    if (i < 5) {
      if (hours[i] > 8) {
        salary += 8 * 10 + (hours[i] - 8) * 15;
      } else {
        salary += hours[i] * 10;
      }
    } else {
      if (hours[i] > 8) {
        salary += 8 * 20 + (hours[i] - 8) * 30;
      } else {
        salary += hours[i] * 20;
      }
    }
  }
  return salary;
}
