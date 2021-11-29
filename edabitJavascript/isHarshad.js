function isHarshad(n) {
	let sum = (n).toString().split("").reduce((acc, curr)=>acc+Number(curr),0);
	return n%sum==0;
}