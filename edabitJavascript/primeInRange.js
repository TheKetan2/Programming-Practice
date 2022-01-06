function primeInRange(n1, n2) {
  for (let i = n1; i <= n2; i++) {
    if (isPrime(i)) {
      return true;
    }
  }
  return false;
}

const isPrime = (num) => {
  if (num == 1 || num == 2) {
    return true;
  }
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
};
