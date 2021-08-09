function longestNonrepeatingSubstring(str) {
	let sol = ""
	for(let i = 0;i<=str.length;i++){
		for(let j = 0;j<=str.length;j++){
			let sbStr = str.substr(i,j);
			// console.log(sbStr)
			let set = new Set([...sbStr]);
			if(sbStr.length === set.size && sol.length < sbStr.length){
				sol = sbStr;
			}
		}
	}
	//console.log(sol)
	return sol;
}
