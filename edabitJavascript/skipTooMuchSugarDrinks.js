function skipTooMuchSugarDrinks(drinks) {
  return drinks.filter((drink) => !["cola", "fanta"].includes(drink));
}
