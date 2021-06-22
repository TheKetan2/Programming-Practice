def mineral_formation(cave):
	if 1 in cave[0] and 1 in cave[-1]:
		return "both"
	elif 1 in cave[0]:
		return "stalactites"
	elif 1 in cave[-1]:
		return "stalagmites"
	