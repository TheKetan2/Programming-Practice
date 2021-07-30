function apocalyptic(n) {
	let temp = BigInt(2**n).toString();
	return temp.includes("666")?"Repent! "+(temp.indexOf("666"))+" days until the Apocalypse!":"Crisis averted. Resume sinning.";
}