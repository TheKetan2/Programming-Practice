function uploadCount(dates, month) {
  return dates.filter((date) => date.includes(month)).length;
}
