function recordTemps(records, currentWeek) {
  return records.map((record, i) => {
    return [
      Math.min(record[0], currentWeek[i][0]),
      Math.max(record[1], currentWeek[i][1]),
    ];
  });
}
