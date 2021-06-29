function numObj(arr) {
	
	return arr.map((num) => {
		let obj = {}
		obj[num] = String.fromCharCode(num)
		return obj;
	})
}