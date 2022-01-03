function reverseWords(string) {
	let strArr = string.split(" ").reverse();
	let sol = strArr.join(" ").trim();
	return sol;
}