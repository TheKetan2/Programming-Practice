function firstRepeat(chars) {

	let obj={};	for(let ch of [...chars]){

		if(obj[ch]){

			return ch;

		}else{

			obj[ch]=1;

		}

	}

	return "-1";

}
