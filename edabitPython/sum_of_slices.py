def sum_of_slices(lst):
	sol = []
	temp = 0
	for num in lst:
		if num+temp >=100:
			sol.append(temp)
			temp= num
		else:
			temp += num
	sol.append(temp)
	return sol