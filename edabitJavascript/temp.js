function tempConversion(celsius) {
  return celsius + 273.15 < 0
    ? "Invalid"
    : [
        Number(((celsius * 9) / 5 + 32).toFixed(2)),
        Number((celsius + 273.15).toFixed(2)),
      ];
}
