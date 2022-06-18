function keyboardMistakes(str) {
	let obj = {
		"4":"A",
		"5":"S",
		"0":"O",
		"1":"I"
	};
	return [...str].map(ch=>obj[ch]?obj[ch]:ch).join("");
}
