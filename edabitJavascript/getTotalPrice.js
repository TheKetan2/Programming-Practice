function getTotalPrice(groceries) {

	let sol = 0;	for(let item of groceries){

		sol +=(item["quantity"]*item["price"])

	}

	return parseFloat(sol.toFixed(2));

}
