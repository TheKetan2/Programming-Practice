function countBoomerangs(arr) {
	let sol = 0;
	for(let i = 2; i<arr.length; i++){
		if(arr[i] == arr[i-2] && arr[i]!==arr[i-1]){
			sol++;
		}
	}
	return sol;
}