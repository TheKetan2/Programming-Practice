function doesTriangleFit(brick, hole) {
	return Math.max(...brick)<=Math.min(...hole)
}