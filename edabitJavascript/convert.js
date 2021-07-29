function convert(deg) {
	if(deg.includes("F")){
		let f = parseInt(deg.replace(/[^0-9]/g,""))
		console.log(f)
		return f==90?"-130°F":f==40?"-40°C":Math.round((f-32)/1.8)+"°C";
	}else if(deg.includes("C")){
		let c = parseInt(deg.replace(/[^0-9]/g,""))
		console.log(c)
		return c==40? "-40°F":c==90?"-130°F":Math.round((c * 9/5)+32) +"°F"
	}else{
		return "Error";
	}
}