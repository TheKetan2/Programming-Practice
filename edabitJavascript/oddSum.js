function oddSum(numbers) {
	let sol = [];
	for(let i = 1; i<numbers.length;i++){
		sol.push((numbers[i-1]+numbers[i])%2==0);
	}
	return sol;
}