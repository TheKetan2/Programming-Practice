function dartsScoring(x, y) {
	let dist = Math.pow((x*x + y*y),0.5);
	if(dist <=1){
		return 10;
	}else if(dist <=5){
		return 5;
	}else if(dist <=10){
		return 1;
	}else{
		return 0;
	}
}