function doubleSwap(str, c1, c2) {
	let sol = "";
	for(let i = 0; i<str.length; i++){
		if(str[i] === c1){
			sol += c2;
		}else if(str[i] === c2){
			sol += c1;
		}else{
			sol += str[i];
		}
	}
	return sol;
}