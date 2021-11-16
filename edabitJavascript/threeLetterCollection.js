function threeLetterCollection(s) {
	let sol = []
	for(let i =0; i<=s.length-3;i++){
		sol.push(s.substr(i,3))
	}
	sol.sort((a,b)=> a.localeCompare(b) )
	return sol
}