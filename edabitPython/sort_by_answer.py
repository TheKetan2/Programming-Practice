def sort_by_answer(lst):
	d = {}
	for eq in lst: 
		try:
			d[eval(eq.replace("x", "*"))].append(eq)
		except:
			d[eval(eq.replace("x", "*"))] = [eq]
	s = sorted(d)
	sol = []
	for sublist in s:
		if len(d[sublist]) > 1:
			for item in d[sublist]:
				sol.append(item)
		else:
			sol.append(d[sublist][0])
	return sol
	