function calculateYears(humanYears) {
	let [h,c,d] =[humanYears, 0, 0];
	for(let i = 1; i<=humanYears;i++ ){
		if(i==1){
			c+=15;
			d+=15;
		}else if(i==2){
			c+=9;
			d+=9;
		}else{
			c+=((humanYears-2)*4);
			d+=((humanYears-2)*5);
			return [h,c,d];
		}
	}
	return [h,c,d];
}