function rowSum(n) {
	let lastNum = 0;
	for(let i = 1;i<=n;i++){
		lastNum+=i;
		//console.log(lastNum);
	}
	return n*(((lastNum-n+1)+lastNum)/2)
}