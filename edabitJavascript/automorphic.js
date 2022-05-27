function automorphic(n) {
	let num = n.toString();
	let sqr = (n*n).toString();
	return n==sqr.slice(sqr.length-sqr.length-num.length)
}