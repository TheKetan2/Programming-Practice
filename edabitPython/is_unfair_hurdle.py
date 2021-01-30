def is_unfair_hurdle(hurdles):
	if len(hurdles) >= 4 or hurdles[0].count(" ") / (hurdles[0].count("#")-1)<4:
		return True
	return False