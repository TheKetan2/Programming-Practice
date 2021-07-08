function numInStr(arr) {
	return arr.filter(str => 
		str.length >str.replace(/[0-9]/g,"").length)
}