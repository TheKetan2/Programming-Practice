function windowMaxes(array, l) {
	let sol = [];
	for(let i = 0;i<=array.length-l;i++){
		sol.push(Math.max(...array.slice(i,i+l)))
	}
	return sol;
}