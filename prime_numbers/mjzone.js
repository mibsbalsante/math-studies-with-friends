for (counter = 0; counter <= 100; counter++) {
  let notPrime = false;
  for (let i = 2; i <= counter; i++) {
    if (counter % i === 0 && i !== counter) {
      notPrime = true;
    }
  }
  if (notPrime === false) {
    console.log(counter);
  }
}
