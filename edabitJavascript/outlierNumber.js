function outlierNumber(arr) {
	let eve = [];
	let odd = [];
	for(let num of arr){
		if(num%2==0){
			eve.push(num);
		}else{
			odd.push(num);
		}
	}
	return eve.length==1?eve[0]:odd[0];
	
}