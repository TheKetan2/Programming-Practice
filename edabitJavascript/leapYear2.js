function leapYear(year) {
  if (year % 4 == 0) {
    return year % 100 !== 0;
  } else {
    return year % 400 === 0;
  }
}
