function countSameEnds(str) {
	let strTemp = str.replace(/[^a-zA-Z ]/g,"").toLowerCase().split(" ");
	let sol = 0;
	for(let s of strTemp){
		//console.log(s);
		if(s[0] === s[s.length-1] && s.length>1){
			sol++;
		}
	}
	return sol;
}