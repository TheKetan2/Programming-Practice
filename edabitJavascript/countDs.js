function countDs(sentence) {
	return sentence.length - sentence.replace(/[Dd]/g,"").length;
}