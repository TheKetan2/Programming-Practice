function isExactlyThree(n) {
	let divs = [1,n];
	if(n<=3){
		return false;
	}
	for(let i = 2;i<= Math.sqrt(n);i++){
		if(n%i===0){
			divs.push(i);
			divs.push(n/i);
		}
	}
	return new Set(divs).size===3?true:false;
}