function isDisarium(n) {
	let arr = n.toString().split("").map(num=>parseInt(num))
	let sum = 0;
	for(let i = 1; i<=arr.length;i++){
		sum+= Math.pow(arr[i-1],i);
	}
	return sum==n;
}