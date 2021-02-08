def color_invert(rgb):
	sol = []
	for i in rgb:
		sol.append(255-i)
	return tuple(sol)