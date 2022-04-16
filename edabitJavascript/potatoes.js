function potatoes(str) {
	let sol = 0;
	while(str.length !== str.replace("potato","").length){
		str = str.replace("potato","");
		sol++;
	}
	return sol;
}