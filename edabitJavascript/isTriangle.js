function isTriangle(a, b, c) {
	let sides = [a,b,c].sort((a,b)=>Number(a)-Number(b));
	return !(sides[0]+sides[1] <=sides[2]);
}