function isPandigital(num) {
	let numStr = num.toString();
	return (new Set(numStr.split(""))).size == 10;
}