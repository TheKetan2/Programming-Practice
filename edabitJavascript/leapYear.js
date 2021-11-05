function leapYear(year) {
  return year % 400 === 0 ? true : year % 4 === 0 ? true : false;
}
