function fixImport(s) {
	let arr = s.split("from");
	return `from${arr[1]} ${arr[0].trim()}`;
}