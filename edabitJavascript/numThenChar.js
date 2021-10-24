function numThenChar(arr) {
	let lenArr = arr.map(a=>a.length);
	arr = arr.flat();
	let arrNum = arr.filter(num => !isNaN(num))
	let arrAlpha = arr.filter(num => isNaN(num))
	arrNum.sort((a,b)=> a-b)
	arrAlpha.sort()
	arr = [...arrNum, ...arrAlpha];
	//console.log(lenArr)
	let sol = [];
	for(let len of lenArr){
		let temp = []
		while(len){
			temp.push(arr.shift())
			len--;
		}
		sol.push(temp)
	}
	return sol;
}