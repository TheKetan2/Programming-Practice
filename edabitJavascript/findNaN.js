function findNaN(number) {
	for(let i = 0; i<number.length; i++){
		if(isNaN(number[i])){
			return i;
		}
	}
	return -1;
}