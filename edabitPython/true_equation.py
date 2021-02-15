def true_equations(lst):
	sol = []
	for eq in lst:
		temp = eq.split("=")
		if eval(temp[0]) == int(temp[1]):
			sol.append(eq)
	return sol