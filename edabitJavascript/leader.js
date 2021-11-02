function leader(arr) {
	let max = Math.max(...arr);
	let sol = [];
	let last= arr.pop();
	while(last !== max){
		sol.unshift(last);
		last = arr.pop();
	}
	sol.unshift(last);
	for(let i = 1; i<sol.length; i++){
		if(sol[i-1] < sol[i]){
			sol.splice(i-1, 1);
		}
	}
	//console.log(sol)
	return sol;
}