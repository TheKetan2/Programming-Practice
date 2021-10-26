function getObject(args) {
	let vals = Object.entries(args)
	vals.sort((a,b)=>{
		return b[1]["marks"]-a[1]["marks"]
	});
	let sol = {};
	for(let i = 1; i<vals.length; i++){
		if(vals[i-1][1]["marks"] === vals[i][1]["marks"]){
			if(vals[i-1][1]["age"]>vals[i][1]["age"]){
				vals.splice(i,1);
			}else{
				vals.splice(i-1,1);
			}
		}	
	}
	vals.sort((a,b)=>{
		return parseInt(a[0]) - parseInt(b[0]);
	})
	vals.forEach((v,index)=> {
		sol[index] = v[1]
	})
//	console.log(sol)
	return sol;
}