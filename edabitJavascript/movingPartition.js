function movingPartition(arr) {
	let sol = [];
	for(let i = 1; i<arr.length; i++){
		sol.push([arr.slice(0,i), arr.slice(i)])
	}
	return sol;
}