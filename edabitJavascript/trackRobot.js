function trackRobot(...steps) {
  let sol = [0, 0];
  for (let i = 0; i < steps.length; i++) {
    let dir = i % 4;
    switch (dir) {
      case 0:
        sol = [sol[0], sol[1] + steps[i]];
        break;
      case 1:
        sol = [sol[0] + steps[i], sol[1]];
        break;
      case 2:
        sol = [sol[0], sol[1] - steps[i]];
        break;
      case 3:
        sol = [sol[0] - steps[i], sol[1]];
        break;
    }
  }
  return sol;
}
