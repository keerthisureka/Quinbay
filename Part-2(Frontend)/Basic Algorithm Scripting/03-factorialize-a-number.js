function factorialize(num) {
  let prod = 1;
  for (let i = 1; i <= num; i++) {
    prod *= i;
  }
  return prod;
}

factorialize(5);