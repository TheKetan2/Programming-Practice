function vendingMachine(products, money, productNumber) {
	if(productNumber<=0 || productNumber>9){
		return 'Enter a valid product number';
	}
	let sol = []
	let changeMoney = [500,200,100,50,20,10];
	let product = products.filter(item => item.number == productNumber);
	if(!product){
		return [];
	}
	if(product[0].price>money){
		return "Not enough money for this product";
	}
	let change = money - product[0].price;
	while(changeMoney[0]>change){
		changeMoney.shift()
	}
	//console.log("One: ",changeMoney, ": ", product[0].price,"-",money,"=",change)
	for(let num of changeMoney){
		if(num<=change){
			sol.push(...Array.from({length:Math.floor(change/num)}, ()=>num));
			change = change%num;
			//console.log("Two: ",change, num)
		}
	}
	//console.log(sol)
	return {product: product[0].name, change: sol}
	
}