function missing(arr1, arr2) {
	for(let i in arr1){
		if(arr2[i] !== arr1[i]){
			return arr1[i];
		}
	}
}