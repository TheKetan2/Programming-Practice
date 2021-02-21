def return_unique(lst):
	sol = []
	for num in lst:
		if lst.count(num) == 1:
			sol.append(num)
	return sol