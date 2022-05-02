function weightAllowed(car, p, maxWeight) {
  return (car + p.reduce((acc, curr) => acc + curr, 0)) * 0.453592 <= maxWeight;
}
