function cars(wheels, bodies, figures) {
  return Math.min(
    Math.floor(wheels / 4),
    Math.floor(bodies / 1),
    Math.floor(figures / 2)
  );
}

/*
Each toy car needs 4 wheels, 
1 car body, and 
2 figures of people to be placed inside. 
*/
