function sortDrinkByPrice(drinks) {
  drinks.sort((a, b) => Number(a["price"]) - Number(b["price"]));
  return drinks;
}
