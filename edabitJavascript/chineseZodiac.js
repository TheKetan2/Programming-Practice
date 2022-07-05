function chineseZodiac(birthYear) {
  let years = [
    "Monkey",
    "Rooster",
    "Dog",
    "Pig",
    "Rat",
    "Ox",
    "Tiger",
    "Rabbit",
    "Dragon",
    "Snake",
    "Horse",
    "Sheep",
  ];
  return years[birthYear % 12];
}

/*
0: Monkey	1: Rooster 	2: Dog 	3: Pig
4: Rat	5: Ox 	6: Tiger 	7: Rabbit
8: Dragon 	9: Snake 	10: Horse 	11: Sheep
*/
