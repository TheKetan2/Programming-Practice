function stutter(word) {
	let first = word.substr(0,2);
	return `${first}... ${first}... ${word}?`;
}