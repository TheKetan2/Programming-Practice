function dashed(str) {
	let sol = "";
	for(let ch of [...str]){
		if("aeiou".includes(ch.toLowerCase())){
			sol += "-"+ch+"-";
		}else{
			sol +=ch;
		}
	}
	return sol;
}