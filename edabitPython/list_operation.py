def list_operation(x, y, n):
	sol = []
	for i in range(x, y+1):
		if i%n == 0:
			sol.append(i)
	return sol