function trimmedAverages(arr) {
	arr.sort((a,b)=>a-b);
	arr.pop();
	arr.shift();
	return Math.round(arr.reduce((acc,curr)=>acc+curr,0)/arr.length);
}
