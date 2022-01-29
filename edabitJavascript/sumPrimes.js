function sumPrimes(arr) {
  let sol = 0;
  for (let num of arr) {
    if (isPrime(num)) {
      sol += num;
    }
  }
  return sol;
}

const isPrime = (num) => {
  if (num == 2 || num == 3) {
    return true;
  }
  if (num == 1) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
};
