function countUppercase(str) {
	return str.join("").replace(/[a-z]/g,"").length;
}
